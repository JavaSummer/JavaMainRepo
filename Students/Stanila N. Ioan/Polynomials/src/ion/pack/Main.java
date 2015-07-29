package ion.pack;

import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Ion
 * The main class.
 */
public final class Main {
	
	/**
	 * Useless constructor.
	 */
	private Main() { };
	
	/**
	 * 
	 * @param args default arguments.
	 * @throws IOException 
	 */
	public static void main(final String[] args) throws IOException {
		Functions func = new Functions();
		InputOutput buff = new InputOutput("input.dat");
		Polynomial a, b, c;
		a = buff.givePoly(1);
		buff.print("The first polynomial:");
		buff.print(a);
		b = buff.givePoly(2);
		buff.print("The second polynomial:");
		buff.print(b);
		ArrayList<String> comm = buff.giveComm();
		int i;
		String scomm;
		for (i = 0; i < comm.size(); i++) {
			scomm = comm.get(i);
			if (scomm.startsWith("ADD")) {
				c = func.add(a, b);
				buff.print("The sum:");
				buff.print(c);
			} else if (scomm.startsWith("SUBTRACT")) {
				c = func.sub(a, b);
				buff.print("The difference:");
				buff.print(c);
			} else if (scomm.startsWith("MULTIPLY")) {
				c = func.mul(a, b);
				buff.print("The product:");
				buff.print(c);
			} else if (scomm.startsWith("MUL_SCAL")) {
				String[] s = scomm.split(" ");
				double num = Double.parseDouble(s[1]);
				c = func.mulScal(a, num);
				buff.print("The multiplication with " + num + " of the first:");
				buff.print(c);
				c = func.mulScal(b, num);
				buff.print("The multiplication with " + num + " of the second:");
				buff.print(c);
			} else if (scomm.startsWith("DIV")) {
				c = func.div(a, b);
				buff.print("The division:");
				buff.print(c);
			} else if (scomm.startsWith("EVAL")) {
				String[] s = scomm.split(" ");
				double num = Double.parseDouble(s[1]);
				buff.print("The evaluation of " + num + " with the first one:");
				buff.print(func.eval(a, num));
				buff.print("The evaluation of " + num + " with the second one:");
				buff.print(func.eval(b, num));
			}
		}
		buff.closeWBuffer();
		//test();
	}
	
	/**
	 * Just for test.
	 */
	public static void test() {
		Functions func = new Functions();
		double[] co = {1, 0, 3, -4, 0.5};
		Polynomial a = new Polynomial(co);
		Polynomial b = new Polynomial(co);
		Polynomial c = func.sub(a, b);
		System.out.println(c.toString());
	}
	
	/**
	 * Show me.
	 * @param a a.
	 * @param b b.
	 */
	public static void show(final Polynomial a, final Polynomial b) {
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
