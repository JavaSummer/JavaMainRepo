
public class Exercice4 {
	/**************EXERCICE 4**********
	 
	 4. Sketch the class definition and method signatures for a Dictionary class, which allows one to store or look up a
     value indexed by a key. Give the method signatures for get, put, isEmpty, keys, and values. The last
     two methods should return parameterized collections. (This class is similar to the builtin class HashMap in the
     Java collections library.)
     
	 **************	ANSWER  ********** 
	 
	 abstract class Dictionary(){
	 //Short class definition:
	  * The Dictionary class is the abstract parent of any class, such as Hashtable, which maps keys to values. 
	  * In any one Dictionary object, every key is associated with at most one value. 
	  *Given a Dictionary and a key, the associated element can be looked up. 
	 
	 //GET_METHOD :
	    public abstract T get(Object key){
        // This method returns the value to which the key is mapped in this dictionary. 
	    }
	 
	 //PUT_METHOD :
	    public abstract T put(K key, V value){
       // Maps the specified key to the specified value in this dictionary. Neither the key nor the value can be null.
         **If this dictionary already contains an entry for the specified key, 
          the value already in this dictionary for that key is returned, after modifying the entry to contain the new element.

         **If this dictionary does not already have an entry for the specified key, 
         an entry is created for the specified key and value, and null is returned.
	     }
	     
	 //ISEMPTY_METHOD :
	    public abstract boolean isEmpty(){
         //Returns true if this dictionary maps no keys to values; false otherwise. 
        }
        
     //KEYS_METHOD :
        public abstract Enumeration<K> keys(){
         //Returns an enumeration of the keys in this dictionary. 
        }
     
     //VALUES_METHOD :
        public abstract Enumeration<V> elements(){
          //Returns an enumeration of the values in this dictionary.
        } 
       }
           
	 *********************************/

}
