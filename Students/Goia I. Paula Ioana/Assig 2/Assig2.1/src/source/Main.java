package source;

public class Main {

	public static void main(String[] args) {
		InOut i = new InOut();
		i.readPolynoms();
		i.getPoly1();
		i.getPoly2();
		
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		p1.createPoly(i.getPoly1());
		p2.createPoly(i.getPoly2());
		
		
		i.writem("		The first polynomial is : \n" +"   "+p1.toString());
		i.writem("		The second polynomial is : \n" +"   "+p2.toString());
		i.readFunction(p1, p2);
		
	}

}
