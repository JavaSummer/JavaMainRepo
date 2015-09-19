import java.awt.Point;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * EX 1 Consider the following Java code fragments. (The first 3 lines
		 * are the same for all of them; it’s just the last line that is
		 * different.) In each case, does the code compile correctly? If so,
		 * does it execute without error, or is there an exception?
		 */
		// Point[] a = new Point[10];
		// Object[] b;
		// b = a;
		// b[0] = new Point(10,20);
		//
		// Works correctly

		// Point[] a = new Point[10];
		// Object[] b;
		// b = a;
		// b[0] = "hi there";
		//
		// Compiles
		// Exception in thread "main" java.lang.ArrayStoreException:
		// java.lang.String
		// at Main.main(Main.java:15)

		// Point[] a = new Point[10];
		// Object[] b;
		// b = a;
		// a[0] = "hi there";
		//
		// Error: Cannot convert from string to point;

		/**
		 * EX 2 What about code that is analogous to that in Question 1, but
		 * that uses ArrayList? For example:
		 */
		// ArrayList<Point> a = new ArrayList<Point>();
		// ArrayList<Object> b;
		// b = a;
		// b.add(new Point(10,20));
		//
		// Error
		// Type mismatch: cannot convert from ArrayList<Point> to
		// ArrayList<Object>

		/**
		 * EX 3 Sketch the class definition and method signatures for a Stack
		 * class, parameterized by the type of element on the stack. Give the
		 * method signatures for push, pop, and isEmpty.
		 */

		// LinkedList has methods that directly implement stack functionality,
		// so you can also just use a LinkedList rather than making a stack
		// class.
		// LinkedList methods are self-explanatory
		// import java.util.LinkedList;
		// public class Stack<T> {
		// private LinkedList<T> storage = new LinkedList<T>();
		// public void push(T v) { storage.addFirst(v); }
		// public T peek() { return storage.getFirst(); }
		// public T pop() { return storage.removeFirst(); }
		// public boolean empty() { return storage.isEmpty(); }
		// public String toString() { return storage.toString(); }
		// }

		/**
		 * EX 4 Sketch the class definition and method signatures for a
		 * Dictionary class, which allows one to store or look up a value
		 * indexed by a key. Give the method signatures for get, put, isEmpty,
		 * keys, and values. The last two methods should return parameterized
		 * collections. (This class is similar to the builtin class HashMap in
		 * the Java collections library.)
		 */
		// Note: according to docs.oracle.com, this class is obsolete. New
		// implemetation should implement the Map interface

		// abstract V get(Object key)
		// Returns an enumeration for the values in the dictionary
		// abstract V put(K key, V value)
		// Maps the specified key to the specified value in this dictionary.
		// abstract boolean isEmpty()
		// Check if the dictionary has keys in it
		// abstract Enumeration<K> keys()
		// Returns an enumeration of the keys in the dictionary
		// abstract Enumeration<V> values()
		// Returns an enumeration of the values in this dictionary.

		/**
		 * EX 5 Joe Mocha is defining an interface Appendable that includes an
		 * append method. He then defines two classes, MyString and MyList,
		 * which both implement Appendable. He wants Java’s type system to allow
		 * a MyString to be appended to a MyString, and a MyList to be appended
		 * to a MyList, but not a MyString to a MyList, or a MyList to a
		 * MyString. Here is his definition of Appendable: interface Appendable
		 * { Appendable append(Appendable a); } What is wrong with this
		 * definition? What is a correct one? Also write a definition for a
		 * class MyString that uses the revised definition of Appendable. (Just
		 * put . . . in the body of the method— we only care about the header.)
		 */

//		Must specify what types are appendable
//		interface Appendable<T> {
//			Appendable<T> apend(Appendable<T> a);
//		}
//		class MyString implements Appendable<MyString> {
//		public Appendable<MyString> append(Appedable<MyString> myString)
//			....
//		}
	}

}
