import java.util.Stack;

public class Exercise3 {

	public static void main(String[] args) {

		Stack<Integer> s = new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.peek());
		/*
		 * The class definition : public class Stack<T> extends Vector<T>
		 * ->where T is the type of object.
		 * The Stack class represents a last-in-first-out stack of objects. 
		 * It extends class Vector with five operations that allow a vector 
		 * to be treated as a stack: the usual push and pop operations, a method 
		 * to check whether the stack is empty or not, a method to search for 
		 * an item in the stack, a method to peek at the top item of the stack.
		 * 
		 * public T push(T item) pushes an item onto the top of this stack
		 * -> where item is the element to be pushed
		 * 
		 * public T pop() removes the object from the top of the stack and returns it
		 * as the value of this function
		 * 
		 * public boolean empty() checks whether the stack is empty or not and
		 * returns true or false depending on that.
		 */
	}

}
