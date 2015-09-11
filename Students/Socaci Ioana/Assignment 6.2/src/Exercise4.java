
public class Exercise4 {

	public static void main(String[] args) {

		/*
		 * The class definition : public abstract class Dictionary<K, V> extends
		 * Object -> where K is the type of the keys and V is the type of the
		 * values in the dictionary The Dictionary class is the abstract parent
		 * of any class, such as HashTable, which maps keys to values. Every key
		 * and every value is an object. To each key in the dictionary is
		 * associated at most one value. Any non-null object can be used as a
		 * key or as a value.
		 * 
		 * public abstract V get(Object key) returns the value to which the key
		 * is mapped in the dictionary or null if the key is not mapped to any
		 * value
		 * 
		 * public abstract V put(K key, V value) maps the specified key to the
		 * specified value in the dictionary; neither the key nor the value can
		 * be null. If this dictionary already contains an entry for the
		 * specified key, the value already in this dictionary for that key is
		 * returned, after modifying the entry to contain the new element.
		 * If this dictionary does not already have an entry for the specified
		 * key, an entry is created for the specified key and value, and null is
		 * returned.
		 * The value can be retrieved by calling the get method with a key that
		 * is equal to the original key.
		 * 
		 * public boolean isEmpty() checks if there are no keys mapped to any values
		 * and returns true or false depending on that.
		 * 
		 * public abstract Enumeration<K> keys() returns an enumeration of the keys in this dictionary.
		 * 
		 * public abstract Enumeration<V> elements() returns an enumeration of the values 
		 * in this dictionary.
		 */
	}
}
