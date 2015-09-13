
public class RootAproximation {
	
	public double evaluatePoly(Polynomial f, double nr) {
		double result = 0;
		double x = 1;
		for (int i = 0; i <= f.getDegree(); i++) {
			result += f.getCoefficient(i) * x;
			x *= nr;
		}
		return result;
	}
	
	public double bisectionMethod(Polynomial f, double infLim, double supLim) {//it finds the root of the polynomial in a given interval

		double mid = 0, tolerance = 0.0000001;
		int i = 0, maxnrOfIterations = 1000000;//to avoid an infinite loop, I chose a max nr of iterations

		while (i <= maxnrOfIterations) {

			mid = (infLim + supLim) / 2;//finds the middle of the interval;
			if (evaluatePoly(f, mid) == 0 || (supLim - infLim) / 2 < tolerance) {//finds the subinterval which contains the root with
				                                                                    //the help of a property that results from the continuity
				                                                                    //of a polynomial function
				return mid;
			} else {
				if (evaluatePoly(f, infLim) * evaluatePoly(f, mid) < 0) {//shrinks the interval by updating either its 
					                                                           //superior or inferior limit
					supLim = mid;
				} else {
					infLim = mid;
				}
			}
			i++;

		}
		
        return 0;
	}
	
	public double interpolationMethod(Polynomial f, double infLim, double supLim) {
		double x = 0, tolerance = 0.0000001f;
		int i = 0, maxnrOfIterations = 1000000;

		while (i <= maxnrOfIterations) {

			//from what I found, the difference between this method and the bisection one 
			//consists in choosing a more appropriate point then the middle of the interval, 
			//i.e. the one given by the following formula
			x = infLim - evaluatePoly(f, infLim)*((supLim-infLim)/(evaluatePoly(f, supLim)-evaluatePoly(f, infLim)));
			if (evaluatePoly(f, x) == 0 || (supLim - infLim) / 2 < tolerance) {
				return x;
			} else {
				if (evaluatePoly(f, infLim) * evaluatePoly(f, x) < 0) {
					supLim = x;
				} else {
					infLim = x;
				}
			}
			i++;

		}
		
        return 0;
	}
}
