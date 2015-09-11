
class MyString implements Appendable<MyString>{

	@Override
	public Appendable<MyString> append(Appendable<MyString> a) {
		System.out.println("appended");
		return null;
	}
	
}
public class Exercise5{
	
	public static void main(String[] args){
		MyString s = new MyString();
		Appendable<MyString> a = new MyString();
		s.append(a);
		/*
		 * If we want to append MyList to MyList and MyString to MyString 
		 * we must know the type so it is necessary to use generic and specify 
		 * what type of object we want to append.
		 * interface Appendable<T>{
		 * 	public Appendable<T>(Appendable<T> a);
		 * }
		 * 
		 * public class MyString implements Appendable<MyString>{
		 *  public Appendable<MyString> append(Appendable<MyString> a){
		 *  		...
		 *  }
		 * }
		 * 
		 */
	}

	
}
