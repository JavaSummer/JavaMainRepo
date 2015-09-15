
public class Exercice5 {
	/************ EXERCICE 5 *********
	 5. Joe Mocha is defining an interface Appendable that includes an append method. He then defines two
     classes, MyString and MyList, which both implement Appendable. He wants Java’s type system to
     allow a MyString to be appended to a MyString, and a MyList to be appended to a MyList, but not a
     MyString to a MyList, or a MyList to a MyString.
     Here is his definition of Appendable:

        interface Appendable {
        Appendable append(Appendable a);
        }
    
    What is wrong with this definition? What is a correct one?
    Also write a definition for a class MyString that uses the revised definition of Appendable. (Just put . . . in
    the body of the method— we only care about the header.)
	 
	 ************ ANSWER ********** 
	 interface Appendable<T> {
        Appendable<T> append(Appendable<T> a);
        }
      
      class MyString() implements Appendable<MyString> {
        public Appendable<MyString> append(Appendable<MyString> s){
        ...
        }
      }  
	 *********************************/

}
