package assign.pack;

import java.util.*;

/**
 * I have used the following algorithm: 
 * if degree(D) < 0 then error 
 * if degree(N) >= degree(D) then
 *  q = 0 
 *  while degree(N) >= degree(D) 
 *  d = D shifted right by (degree(N) - degree(D))
 *  q(degree(N) - degree(D)) = N(degree(N)) / d(degree(d)) // by construction, degree(d) = degree(N) 
 *  d = d * q(degree(N) - degree(D))
 *  N = N - d
 *  endwhile 
 *  r = N 
 *  else 
 *  q = 0 
 *  r = N 
 *  endif
 * return (q, r)
 * 
 * @author Crina
 *
 */

public class Twist_Division {

	public void division(Polynomial num, Polynomial deNum, Polynomial q, Polynomial r) {

		if (deNum.deg < 0) {
			System.out.println("The denumerator has the degree less than 0 !");
		} else {
			q.coeff = new int[num.coeff.length];
			r.coeff = new int[num.coeff.length];
			Arrays.fill(q.coeff, 0);
			Arrays.fill(r.coeff, 0);
			q.setDegree();
			r.setDegree();
			if (num.deg >= deNum.deg) {
				Functions f = new Functions();
				Polynomial d = new Polynomial();
				d.coeff = new int[num.coeff.length + deNum.coeff.length];

				while (num.deg >= deNum.deg) {

					Arrays.fill(d.coeff, 0);
					d.setDegree();
					System.arraycopy(deNum.coeff, 0, d.coeff, num.deg - deNum.deg, deNum.coeff.length);
					d.setDegree();
					q.coeff[num.deg - deNum.deg] = num.coeff[num.deg] / d.coeff[d.deg];
					q.setDegree();
					for (int i = 0; i <= d.deg; i++)
						d.coeff[i] *= q.coeff[num.deg - deNum.deg];
					num = f.SUBTRACT(num, d);
					num.setDegree();
				}
				for (int i = 0; i <= num.deg; i++)
					r.coeff[i] = num.coeff[i];
				r.setDegree();
			} else {
				q.deg = 0;
				r = num;
				r.setDegree();
			}
		}

	}

}
