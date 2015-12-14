package Exercises1and2;

import java.awt.Point;
import java.util.ArrayList;

public class Exercise2 {

	public void tryCode() {

		{
			ArrayList<Point> a = new ArrayList<Point>();
			ArrayList<Object> b;
			/*
			 * b = a;
			 * 
			 * compile time error here: Type mismatch: cannot convert from
			 * ArrayList<Point> to ArrayList<Object> 
			 * 
			 * 
			 */
			//b.add(new Point(10, 20));
		}

		{
			ArrayList<Point> a = new ArrayList<Point>();
			ArrayList<Object> b;
			/*b = a;
			 * 
			 * same error
			 * 
			 * */
			//b.add("hi there");
		}

	}

}
