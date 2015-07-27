package source;

public class Main {

	public static void main(String[] args) {
		InOut i = new InOut();
		i.readPolynoms();
		
		Polynomial p1 = new Polynomial(i.getPoly1());
		Polynomial p2 = new Polynomial(i.getPoly2());
		
		i.writem("		The first polynomial is : \n" +"   "+p1.toString());
		i.writem("		The second polynomial is : \n" +"   "+p2.toString());
		i.readFunction(p1, p2);
		
	}

}
