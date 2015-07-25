package partI;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import partI.Polynomial;
import java.io.*;
public class Functions {
	private Scanner x;	
	/*
	 * Open a file - "pol.txt" - for reading
	 */
	public void openFile()
	{
		try{
			x = new Scanner(new File("pol.txt"));
			
		}
		catch(Exception e){
			System.out.println("Could not open the file");
		}
	}

	/*
	 * Open a file - output.txt - for writing
	 */
	public void openForW(String s){
		try{
			String filename = "output.txt";
			FileWriter fw = new FileWriter(filename, true);
			fw.write(s);
			fw.write("\n");
			fw.close();
		}
		catch(IOException e){
			System.err.println("Could not write to file");
		}
	}
	/*
	 * Read the next k commands from the file line by line
	 */
	public void next(Polynomial p, Polynomial p2){
		while(x.hasNext()){
			String currentLine = x.nextLine();
			//System.out.println(currentLine);
			if(currentLine.equals("ADD")){
				add(p, p2);
			}
			else if(currentLine.equals("DELETE")){
				delete(p, p2);
			}
			else if(currentLine.equals("MULTIPLY")){
				multiply(p, p2);
			}
			else{
				String[] words = currentLine.split(" ");
				if(words[0].equals("MUL_SCAL")){
					int value = Integer.parseInt(words[1]);
					multiplyWith(p, value);
					multiplyWith(p2, value);
				}
				else if(words[0].equals("EVAL")){
					int value = Integer.parseInt(words[1]);
					evalOn(p, value);
					evalOn(p2, value);				
				}
			}
		}
	}
	/*
	 * Create a polynomial by reading the information from a line
	 */
	public Polynomial createPol(){
		String currentLine = x.nextLine();
		int j=0;
		String[] arr = currentLine.split(" ");
		int[] v = new int[arr.length];
		if(arr.length!=0){
			for(int k=arr.length-1; k>=0; k--){
				v[j] = Integer.parseInt(arr[k]);
				j++;
			}
		}
		Polynomial p = new Polynomial(arr.length-1, v);
		return p;
	}
	
	/*
	 * Add two polynomials
	 * p - Polynomial
	 * p2 - Polynomial
	 */
	public void add(Polynomial p, Polynomial p2){
		int[] coeff1 = p.getCoeff();
		int[] coeff2 = p2.getCoeff();
		int coeff[] = new int[100];
		Polynomial smaller = p.getSmaller(p, p2);
		Polynomial greater = p.getGreater(p, p2);
		int min = smaller.getDegree();
		int max = greater.getDegree();
		for (int i=0; i<=max; i++){
			if(i>min){
				coeff[i] = greater.getCoeff()[i];
			}
			else{
				coeff[i] = coeff1[i] + coeff2[i];
				
			}
		}
		Polynomial result = new Polynomial(max, coeff);
		openForW("The result of addition is: " + result.toString());
		//System.out.println("The Result of addition is: "+result.toString());
	}
	/*
	 * Delete two polynomials 
	 * input: p - Polynomial
	 * 		  p2 - Polynomial
	 */
	public void delete(Polynomial p, Polynomial p2){
		int[] coeff1 = p.getCoeff();
		int[] coeff2 = p2.getCoeff();
		int coeff[] = new int[100];
		Polynomial smaller = p.getSmaller(p, p2);
		Polynomial greater = p.getGreater(p, p2);
		int min = smaller.getDegree();
		int max = greater.getDegree();
		for (int i=0; i<=max; i++){
			if(i>min){
				coeff[i] = greater.getCoeff()[i];
			}
			else{
				coeff[i] = coeff1[i] - coeff2[i];
			}
		}
		Polynomial result = new Polynomial(max, coeff);
		openForW("The result of delete is: " + result.toString());		
		//System.out.println("The Result of delete is: "+result.toString());
	}

	/*
	 * Multiply two polynomials
	 * p - Polynomial
	 * p2 - Polynomial
	 */
	public void multiply(Polynomial p, Polynomial p2){
		int d = 100;
		int[] coeff = new int[100];
		Polynomial result = new Polynomial(d, coeff);
		int degree=0;
		for(int i=0; i<p.getDegree()+1; i++){
			for(int j=0; j<p2.getDegree()+1; j++){
				int k = i+j;
				if(k > degree){
					degree = k;
				}
				result.coeff[k] += p.getCoeff()[i] * p2.getCoeff()[j];
			}
		}
		int[] v = new int[degree+1];
		for(int i=0; i<=degree; i++){
			v[i] = result.getCoeff()[i];
		}
		Polynomial r2 = new Polynomial(degree, v);
		openForW("The result of multiplication is: " + r2.toString());
		//System.out.println("The Result of multiplication is: "+r2.toString());
	}
	/*
	 * Multiply a polynomial with a given value
	 * p - Polynomial
	 * value - integer
	 */
	public void multiplyWith(Polynomial p, int value){
		int[] copyCoeffOfP = new int[p.getDegree()+1];
		for(int i=0; i<=p.getDegree();i++){
			copyCoeffOfP[i] = p.getCoeff()[i]*value;
		}
		Polynomial c = new Polynomial(p.getDegree(), copyCoeffOfP);
		openForW("The result of multiplication with " + value + " is: ");
		openForW(c.toString());
		//System.out.println(c.toString());

	}
	/*
	 * Evaluate a polynomial on a given value
	 * p - Polynomial
	 * value - integer
	 */
	public void evalOn(Polynomial p, int value){
		int[] copyCoeffOfP = new int[p.getDegree()+1];
		for(int i=0; i<=p.getDegree();i++){
			copyCoeffOfP[i] = p.getCoeff()[i]/value;
	}
		Polynomial c = new Polynomial(p.getDegree(), copyCoeffOfP);
		openForW("The result of evaluation on " + value + " is: ");
		openForW(c.toString());
		//System.out.println(c.toString());
	}
	

}