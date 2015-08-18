
public class RootAproximation {

	public float evaluatePoly(int[] f, int size, float nr) {
		float result = 0;
		float x = 1;
		for (int i = 0; i < size; i++) {
			result += f[i] * x;
			x *= nr;
		}
		return result;
	}

	public float bisectionMethod(int[] f, int n, float infLim, float supLim) {//it finds the root of the polynomial in a given interval

		float mid = 0, tolerance = 0.0000001f;
		int i = 0, maxnrOfIterations = 1000000;//to avoid an infinite loop, I chose a max nr of iterations

		while (i <= maxnrOfIterations) {

			mid = (infLim + supLim) / 2;//finds the middle of the interval;
			if (evaluatePoly(f, n, mid) == 0 || (supLim - infLim) / 2 < tolerance) {//finds the subinterval which contains the root with
				                                                                    //the help of a property that results from the continuity
				                                                                    //of a polynomial function
				return mid;
			} else {
				if (evaluatePoly(f, n, infLim) * evaluatePoly(f, n, mid) < 0) {//shrinks the interval by updating either its 
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
	
	public float interpolationMethod(int[] f, int n, float infLim, float supLim) {
		float x = 0, tolerance = 0.0000001f;
		int i = 0, maxnrOfIterations = 1000000;

		while (i <= maxnrOfIterations) {

			//from what I found, the difference between this method and the bisection one 
			//consists in choosing a more appropriate point then the middle of the interval, 
			//i.e. the one given by the following formula
			x = infLim - evaluatePoly(f, n, infLim)*((supLim-infLim)/(evaluatePoly(f, n, supLim)-evaluatePoly(f, n, infLim)));
			if (evaluatePoly(f, n, x) == 0 || (supLim - infLim) / 2 < tolerance) {
				return x;
			} else {
				if (evaluatePoly(f, n, infLim) * evaluatePoly(f, n, x) < 0) {
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
