package exercise5;

public interface Appendable<T> {

	Appendable<T> append(Appendable<? extends T> a);
	/*
	 * I hope this is the correct way to do it
	 * 
	 * The problem with the original method was that the object sent to it had
	 * no constraint except for implementing the Appendable interface.Thus, if,
	 * for example, the method would have been called from an instance of
	 * MyString class,a myList object could have been sent as a parameter, which
	 * was unwanted.
	 * 
	 * Now, in this particular case, only an object that extends MyList or
	 * MyString could be sent to the method. This means appending these two 
	 * different types is no longer an option
	 */

}
