package partI;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import partI.PolynomialFunctions;

public class InputOutputFunctions {
	public PolynomialFunctions polFct = new PolynomialFunctions();
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
	public void writeToFile(String s, String filename){
		try{
			//String filename = "output.txt";
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
	 * Read the next k commands from the file line by line
	 */
	public void readNextCommand(){
		Polynomial p = createPol();
		Polynomial p2 = createPol();
		InputOutputFunctions IOF = new InputOutputFunctions();
		while(x.hasNext()){
			String currentLine = x.nextLine();
			if(currentLine.equals("ADD")){
				Polynomial result  = polFct.add(p, p2);
				IOF.writeToFile("The result of addition is: " + result.toString(), "output.txt");
				System.out.println("The Result of addition is: "+result.toString());
				
			}
			else if(currentLine.equals("DELETE")){
				Polynomial result = polFct.delete(p, p2);
				IOF.writeToFile("The result of delete is: " + result.toString(), "output.txt");		

			}
			else if(currentLine.equals("MULTIPLY")){
				Polynomial result = polFct.multiply(p, p2);
				IOF.writeToFile("The result of multiplication is: " + result.toString(), "output.txt");

			}
			else{
				String[] words = currentLine.split(" ");
				if(words[0].equals("MUL_SCAL")){
					int value = Integer.parseInt(words[1]);
					Polynomial result1 = polFct.multiplyWith(p, value);
					IOF.writeToFile("The result of multiplication with " + value + " is: ", "output.txt");
					System.out.println(result1.toString());
					IOF.writeToFile(result1.toString(), "output.txt");
					Polynomial result2 =  polFct.multiplyWith(p2, value);
					IOF.writeToFile(result2.toString(), "output.txt");

					
				}
				else if(words[0].equals("EVAL")){
					int value = Integer.parseInt(words[1]);
					IOF.writeToFile("The result of evaluation on " + value + " is: ","output.txt");
					Polynomial result1 = polFct.evalOn(p, value);
					IOF.writeToFile(result1.toString(), "output.txt");
					Polynomial result2 = polFct.evalOn(p2, value);	
					IOF.writeToFile(result2.toString(), "output.txt");
				}
			}
		}
	}
	

}
