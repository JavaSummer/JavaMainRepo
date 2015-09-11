
public class Exercise1 {

	public static void main(String[] args) {
		/*
		 * 1) 
		 * Point[] a = new Point[10]; 
		 * Object[] b;
		 * b = a; 
		 * b[0] = new Point(10,20);
		 * 
		 * The code compiles correctly
		 */

		/*
		 * 2)
		 * Point[] a = new Point[10];
		 * Object[] b; 
		 * b = a; 
		 * b[0] = "Hi there";
		 * 
		 * The code compiles but we get an ArrayStoreException
		 */
		

		/*
		 * 3)
		 * Point[] a = new Point[10]; 
		 * Object[] b; 
		 * b = a; 
		 * a[0] = "Hi there";
		 * 
		 * The code does not compile (It cannot convert from String to Point)
		 */
	
	}

}
