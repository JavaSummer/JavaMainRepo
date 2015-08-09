import java.io.*;
import java.util.Scanner;
import java.io.*;

public class InputOutput {
	String line = null;
	File file = new File("pol.txt");
	public void Input(Polynomial p1, Polynomial p2){
		
	try{
		Scanner input = new Scanner(file);
		Functions f = new Functions();
		p1.coeff = input.nextLine();
		p2.coeff = input.nextLine();
		int [] a1 = p1.getCoeff();
		int [] a2 = p2.getCoeff();
		p1.degree = a1.length;
		p2.degree = a2.length;
		if((p1.coeff != null)&&(p2.coeff != null)){
			line=input.nextLine();
			while(input.hasNextLine()){
				line = input.nextLine();
				if(line.equals("ADD")){
					f.ADD(a1, a2, p1.degree, p2.degree);
				}
				if(line.equals("SUBTRACT")){
					f.SUBTRACT(a1, a2, p1.degree, p2.degree);
				}
				if(line.equals("MULTIPLY")){
					f.MULTIPLY(a1, a2, p1.degree, p2.degree);
				}
				if(line.startsWith("MUL_SCAL")){
					String [] op = line.split(" ");
					f.MUL_SCAL(a1, a2, p1.degree, p2.degree,Integer.parseInt(op[1]));
				}
				if(line.startsWith("EVAL")){
					String [] op = line.split(" ");
					f.EVAL(a1, a2, p1.degree, p2.degree,Integer.parseInt(op[1]));
				}
		}
	}
		input.close();
}
	catch(FileNotFoundException ex){
		ex.printStackTrace();
	}
	catch(IOException ex){
		System.out.println("Cannot read file " + "pol.txt");
	}

}
	public void Output (int coeff, int i){
		try{
			FileWriter write = new FileWriter("output.txt", true);
			PrintWriter print_line = new PrintWriter(write);
			print_line.print(coeff);
			print_line.print("X");
			print_line.print("^");
			print_line.print(i);
			print_line.print(" ");
			print_line.printf("%s", "\n");
			
			print_line.close();
		}
		catch(IOException e){
			System.out.println("Cannot print ");
		}
	}
	
	public void Output2 (int nr1, int nr2){
		try{
			FileWriter write = new FileWriter ("output.txt",true);
			PrintWriter print_line = new PrintWriter (write);
			print_line.print("First Polynomial ");
			print_line.print(nr1);
			print_line.println("\n");
			print_line.print("Second Polynomial ");
			print_line.print(nr2);
			print_line.println("\n");
			print_line.close();
	}
		catch(IOException e){
			System.out.println("Cannot write in file ");
		}
	}
	public void Output3 (){
		try{
			FileWriter write = new FileWriter("output.txt", true);
			PrintWriter print_line = new PrintWriter(write);
			print_line.println("\n");
			print_line.close();
		}
		catch(IOException e){
			System.out.println("Cannot print ");
		}
	}
}

