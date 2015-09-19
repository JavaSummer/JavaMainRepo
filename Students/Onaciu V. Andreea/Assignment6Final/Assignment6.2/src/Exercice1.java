
public class Exercice1 {
	/************EXERCICE 1*******
	1. Consider the following Java code fragments. (The first 3 lines are the same for all of them; it’s just the last line
			that is different.) In each case, does the code compile correctly? If so, does it execute without error, or is there
			an exception?
			A)
			Point[] a = new Point[10];
			Object[] b;
			b = a;
			
			B)
			b[0] = new Point(10,20);
			Point[] a = new Point[10];
			Object[] b;
			b = a;
			b[0] = "hi there";
			
			C)
			Point[] a = new Point[10];
			Object[] b;
			b = a;
			a[0] = "hi there";
			
			
			***************ANSWER************
			
			A) The code compiles and executes without error.
			B) The code compiles, but it gets a runtime ArrayStoreException.
			C) The code doesn't compile,it cannot convert from String to Point.
			
	        *************************/
}
