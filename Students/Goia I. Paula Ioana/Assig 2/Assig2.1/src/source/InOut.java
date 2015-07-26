package source;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class InOut {
	
	private String poly1;
	private String poly2;
	
	public InOut (){	
	}
	
	public void  readPolynoms(){
	
		Scanner sc;
		String line ;
		try {
			sc = new Scanner(new File("E:/workspace-oop/Assig2.1/src/source/Input"));
			line = sc.nextLine();
			setPoly1(line);
			line = sc.nextLine();
			setPoly2(line);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public void readFunction( Polynomial p1 , Polynomial p2){
		String message ="";
		try {
			for (String lines : Files.readAllLines(Paths.get("E:/workspace-oop/Assig2.1/src/source/Input"))) {
			    if ( lines.contains("ADD")){
			    	 message="  	 The sum is = \n"+"   "+Functions.add(p1,p2);
			    	 writem(message);
			    }
				if ( lines.contains("SUBSTRACT")){
					 message="   	The subtraction is  = \n "+"   "+Functions.sub(p1,p2);
					 writem(message);
				}
				if ( lines.contains("MULTIPLY ")){
					 message="  	 The multiplication is  =  \n"+"   "+Functions.mult(p1,p2);
					 writem(message);
				}
				if ( lines.contains("MUL_SCAL")){
					 String[] scalar = lines.split(" ");
					 Integer scal = Integer.parseInt(scalar[1]);
					 message="   	The 1st polynomial multiplied with the scalar: "+scal+" is   = \n"+"   "+Functions.multByScalar(p1,scal);
					 writem(message);
					 message="    	The 2nd polynomial multiplied with the scalar: "+scal+" is   = \n"+"   "+Functions.multByScalar(p2,scal);
					 writem(message);
				}
				if ( lines.contains("EVAL")){
					 String[] scalar = lines.split(" ");
					 Integer scal = Integer.parseInt(scalar[1]);
					 message="   	The 1st polynomial evaluated with "+scal+" is   = "+"   "+Functions.eval(p1,scal);
					 writem(message);
					 message="    	The 2nd polynomial evaluated with "+scal+" is   = "+"   "+Functions.eval(p2,scal);
					 writem(message);
				}

			}
		} catch ( IOException e) {
			e.printStackTrace();	
		}
	}
	
	public void writem(String message ){

		try{
				String filename = "E:/workspace-oop/Assig2.1/src/source/output";
				FileWriter fw = new FileWriter(filename, true);
				fw.write(message);
				fw.write("\n");
				fw.write("\n");
				fw.close();
			}
		catch(IOException e){
			System.err.println("Impossible to write in file :(");
		}
	}

	public String getPoly1() {
		return poly1;
	}


	public void setPoly1(String poly1) {
		this.poly1 = poly1;
	}


	public String getPoly2() {
		return poly2;
	}


	public void setPoly2(String poly2) {
		this.poly2 = poly2;
	}

}
