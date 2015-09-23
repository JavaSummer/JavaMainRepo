package Exercises1and2;

import java.awt.Point;
import java.util.ArrayList;

public class Exercise1 {

	public void tryCode() {

		{//this works fine
		Point[] a = new Point[10];
		Object[] b;
		b = a;
		b[0] = new Point(10, 20);
		}
		
		{//this works fine
		Point[] a = new Point[10];
		Object[] b;
		b = a;
		b[0] = "hi there";
		}
		
		//there is a problem with this
		Point[] a = new Point[10];
		Object[] b;
		b = a;
		/* a[0] = "hi there";
		 * 
		 * This is the part that gives a compiler error.
		 * The problem is that a String can be assigned to an object
		 * (as in the second case) but not to a Point
		 * 
		 * */

	}

}
