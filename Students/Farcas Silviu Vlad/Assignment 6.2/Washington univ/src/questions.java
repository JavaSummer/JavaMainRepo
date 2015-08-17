
public class questions {
	/*
	 * Question 1
	 * 
	 * 1) the code compiles correctly, no exceptions
	 * 
	 * 2)the code compiles correctly, but we have an exception:
	 * ArrayStoreException
	 * 
	 * 3)the code does not compile
	 * 
	 * 
	 * Question 2
	 * 
	 * the code won't compile
	 * 
	 * 
	 * Question 3
	 * 
	 * public class Stack<E> extends Vector<E>
	 * 
	 * The Stack class represents a last-in-first-out (LIFO) stack of objects.
	 * It extends class Vector with five operations that allow a vector to be
	 * treated as a stack. The usual push and pop operations are provided, as
	 * well as a method to peek at the top item on the stack, a method to test
	 * for whether the stack is empty, and a method to search the stack for an
	 * item and discover how far it is from the top.
	 * 
	 * public E push(E item) Pushes an item onto the top of this stack.
	 * Parameters: item - the item to be pushed onto this stack. Returns: the
	 * item argument.
	 * 
	 * public E pop() Removes the object at the top of this stack and returns
	 * that object as the value of this function. Returns: The object at the top
	 * of this stack (the last item of the Vector object).
	 * 
	 * public boolean empty() Tests if this stack is empty. Returns: true if and
	 * only if this stack contains no items; false otherwise.
	 * 
	 * 
	 * Question 4
	 * 
	 * public abstract class Dictionary<K,V> extends Object The Dictionary class
	 * is the abstract parent of any class, such as Hashtable, which maps keys
	 * to values. Every key and every value is an object. In any one Dictionary
	 * object, every key is associated with at most one value. Given a
	 * Dictionary and a key, the associated element can be looked up. Any
	 * non-null object can be used as a key and as a value.
	 * 
	 * public abstract boolean isEmpty() Tests if this dictionary maps no keys
	 * to value. The general contract for the isEmpty method is that the result
	 * is true if and only if this dictionary contains no entries. Returns: true
	 * if this dictionary maps no keys to values; false otherwise.
	 * 
	 * public abstract Enumeration<K> keys() Returns an enumeration of the keys
	 * in this dictionary. The general contract for the keys method is that an
	 * Enumeration object is returned that will generate all the keys for which
	 * this dictionary contains entries. Returns: an enumeration of the keys in
	 * this dictionary.
	 * 
	 * public abstract V get(Object key) Returns the value to which the key is
	 * mapped in this dictionary. The general contract for the isEmpty method is
	 * that if this dictionary contains an entry for the specified key, the
	 * associated value is returned; otherwise, null is returned. Parameters:
	 * key - a key in this dictionary. null if the key is not mapped to any
	 * value in this dictionary. Returns: the value to which the key is mapped
	 * in this dictionary;
	 * 
	 * public abstract V put(K key, V value) Maps the specified key to the
	 * specified value in this dictionary. Neither the key nor the value can be
	 * null. If this dictionary already contains an entry for the specified key,
	 * the value already in this dictionary for that key is returned, after
	 * modifying the entry to contain the new element. If this dictionary does
	 * not already have an entry for the specified key, an entry is created for
	 * the specified key and value, and null is returned. The value can be
	 * retrieved by calling the get method with a key that is equal to the
	 * original key. Parameters: key - the hashtable key. value - the value.
	 * Returns: the previous value to which the key was mapped in this
	 * dictionary, or null if the key did not have a previous mapping.
	 * 
	 * public abstract Enumeration<V> elements() Returns an enumeration of the
	 * values in this dictionary. The general contract for the elements method
	 * is that an Enumeration is returned that will generate all the elements
	 * contained in entries in this dictionary. Returns: an enumeration of the
	 * values in this dictionary.
	 * 
	 * 
	 * Question 5
	 * 
	 * Appendable needs to know what type are the items which are appended.
	 * 
	 * interface Appendable<T> {
	 * 		Appendable<T> append(Appendable<T> a)
	 * }
	 * 
	 * class MyString implements Appendable <MyString> {
	 * 		public Appendable<MyString> append (Appendable<MyString> a){
	 * 		...
	 * }
	 * 
	 */
}