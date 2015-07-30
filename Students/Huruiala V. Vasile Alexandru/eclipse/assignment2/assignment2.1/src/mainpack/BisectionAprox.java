package mainpack;

import java.util.ArrayList;

/**
 * 
 * @author alexh
 *
 */
public class BisectionAprox {
	/** Polynimial class. */
	private Polynomial pol;
	/** List. */
	private ArrayList<Double> list;
	
	/** Used for finding the intervals. */
	private double startingLowBound;
	/** Used for finding the intervals. */
	private double startingHighBound;
	/** Used for finding the intervals. */
	private int maxRecursions;
	
	/** Used for finding the root. */
	private double imageTolerance;
	/** Used for finding the root. */
	private double parameterTolerance;
	/** Used for finding the root. */
	private int maxIterations;
	
	/** Used for finding the intervals by default. */
	private static final double DEFAULT_STARTING_LOW_BOUND = -32768;
	/** Used for finding the intervals by default. */
	private static final double DEFAULT_STARTING_HIGH_BOUND = 32767;
	/** Used for finding the intervals by default. */
	private static final int DEFAULT_MAX_RECURSIONS = 24;
	
	/** Used for finding the root by default. */
	private static final double DEFAULT_IMAGE_TOLERANCE = 1E-16;
	/** Used for finding the root by default. */
	private static final double DEFAULT_PARAMETER_TOLERANCE = 1E-16;
	/** Used for finding the root by default. */
	private static final int DEFAULT_MAX_ITERATIONS = 1024;
	/** Used for determining what is considered 0 in finding the interval. */
	private static final double ZERO_TOLERANCE_INTERVAL = 1E-4;
	/** Used for determining what is considered 0 in the refining process. */
	private static final double ZERO_TOLERANCE_REFINE = 0.1;
	
	/**
	 * Constructor with advanced parameters.
	 * @param poly {@link Polynomial}
	 * @param startLowBound double - for finding root intervals
	 * @param startHighBound double - for finding root intervals
	 * @param maxRec integer - for finding root intervals
	 * @param imgTolerance double - for the bisection method
	 * @param paramTolerace double - for the bisection method
	 * @param maxIter integer - for the bisection method
	 */
	public BisectionAprox(final Polynomial poly, 
			final double startLowBound, final double startHighBound, 
			final int maxRec, final double imgTolerance, 
			final double paramTolerace, final int maxIter) {
		
		this.pol = new Polynomial(poly);
		this.list = new ArrayList<Double>((this.pol.getDeg() - 1) * 2);
		
		this.startingLowBound = startLowBound;
		this.startingHighBound = startHighBound;
		this.maxRecursions = maxRec;
		
		this.imageTolerance = imgTolerance;
		this.parameterTolerance = paramTolerace;
		this.maxIterations = maxIter;
	}
	
	/**
	 * Constructor using default bisection parameters.
	 * @param poly {@link Polynomial}
	 */
	public BisectionAprox(final Polynomial poly) {
		this(poly, DEFAULT_STARTING_LOW_BOUND, 
				DEFAULT_STARTING_HIGH_BOUND, DEFAULT_MAX_RECURSIONS, 
				DEFAULT_IMAGE_TOLERANCE, DEFAULT_PARAMETER_TOLERANCE, 
				DEFAULT_MAX_ITERATIONS);
	}

	/**
	 * Updates the list with pairs of intervals.
	 * @param lowBound double
	 * @param highBound double
	 * @param iteration int
	 */
	private void recFindInterval(final double lowBound, final double highBound,
			final int iteration) {
		
		double mid = (lowBound + highBound) / 2;
		
		double lowBoundImage = Polynomial.evaluateDouble(this.pol, lowBound);
		double midImage = Polynomial.evaluateDouble(this.pol, mid);
		double highBoundImage = Polynomial.evaluateDouble(this.pol, highBound);
		
		if (iteration == this.maxRecursions) {
			if (Math.signum(lowBoundImage) * Math.signum(midImage) 
					== -1 || Math.abs(midImage) <= ZERO_TOLERANCE_INTERVAL) {
				this.list.add(lowBound);
				this.list.add(mid);
			} else if (Math.signum(midImage) * Math.signum(highBoundImage)
					== -1 || Math.abs(midImage) <= ZERO_TOLERANCE_INTERVAL) {
				this.list.add(mid);
				this.list.add(highBound);
			}
		} else {
			recFindInterval(lowBound, mid, iteration + 1);
			recFindInterval(mid, highBound, iteration + 1);
		}
	}
	
	/**
	 * Returns a double array containing pairs representing intervals.
	 * @return double[]
	 */
	private double[] findInterval() {		
		recFindInterval(this.startingLowBound, this.startingHighBound, 0);
		
		double[] limits = new double[this.list.size()];
		for (int i = 0; i < this.list.size(); i++) {
			limits[i] = this.list.get(i);
		}
		
		return limits;
	}
	
	/**
	 * Performs the bisection algorithm and returns 
	 * the root after it no longer exceeds 
	 * the minimum tolerance or until it runs all iterations.
	 * @param lowLimit double
	 * @param highLimit double
	 * @return double
	 */
	private double bisection(final double lowLimit, final double highLimit) {
		
		double low = lowLimit;
		double high = highLimit;
		
		int iterations = 0;
		while (iterations < this.maxIterations) {
			double mid = (low + high) / 2;
			
			double lowImage = Polynomial.evaluateDouble(this.pol, low);
			double midImage = Polynomial.evaluateDouble(this.pol, mid);
			
			//Exit condition
			if ((midImage <= this.imageTolerance) 
					|| ((low - high) <= this.parameterTolerance)) {
				return mid;
			} else {
				//Next interval
				if (Math.signum(lowImage) * Math.sin(midImage) == -1) {
					high = mid;
				} else {
					low = mid;
				}
			}
			iterations++;
		}
		
		return (low + high) / 2;
	}
	
	/**
	 * Returns a double[] containing all found roots - may contain duplicates.
	 * @return double[]
	 */
	public final double[] aproximateRoots() {		
		double[] intervals = findInterval();

		double[] result = new double[intervals.length / 2];
		for (int i = 0; i < intervals.length; i += 2) {
			result[i / 2] = bisection(intervals[i], intervals[i + 1]);
		}
		
		return result;
	}
	
	/**
	 * Returns a double[] containing all found roots 
	 * that tries to not contain duplicates.
	 * @return double[]
	 */
	public final double[] refinedRoots() {
		//Get unrefined roots
		double[] rawRoots = this.aproximateRoots();
		
		//Find the ones that are different than the tolerance
		double[] tempRoots = new double[rawRoots.length];
		int rootsInTemp = 0;
		for (int i = 0; i < rawRoots.length; i++) {
			boolean rootIsNew = true;
			
			for (int j = 0; j < rootsInTemp && rootIsNew; j++) {
				if (Math.abs(rawRoots[i] - tempRoots[j]) 
						<= ZERO_TOLERANCE_REFINE) {
					rootIsNew = false;
				}
			}
			
			if (rootIsNew) {
				tempRoots[rootsInTemp] = rawRoots[i];
				rootsInTemp++;
			}
		}
		
		double[] finalRoots = new double[rootsInTemp];
		for (int i = 0; i < rootsInTemp; i++) {
			finalRoots[i] = tempRoots[i];
		}
		
		return finalRoots;
	}
}
