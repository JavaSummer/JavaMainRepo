import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		HelpfulFunctions obj = new HelpfulFunctions();
		int[] firstPoly = new int[20], secPoly = new int[20];

		BufferedReader br = new BufferedReader(new FileReader("readme.txt"));

		// reading the first polynomial
		String line = br.readLine();
		int m = obj.extractPolyMethod2(firstPoly, line);
		// reading the second polynomial
		line = br.readLine();
		int n = obj.extractPolyMethod2(secPoly, line);
		
		obj.initialize(m,firstPoly, n,secPoly);
		
		//empty line
		line = br.readLine();
		
		// reading the commands
		
		try {
			String s = "lets initialize you";
			 
			File file = new File("output.txt");
 
			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			while (line != null) {
				
				line = br.readLine();
				if (line!= null){
					s=obj.executeCommand(line);
					bw.write(s);
					bw.newLine();
				}
			}
			
			
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		br.close();
		
		int [] poly = new int [10];
		int size = obj.extractPolyMethod2(poly, "1 -8 15");
		RootAproximation obj2 = new RootAproximation();
		System.out.println("The root is, by bisection method "+obj2.bisectionMethod(poly, size,1,4));
		System.out.println("The root is, by linear interpolation method "+obj2.interpolationMethod(poly, size,1,4));
		
		//division testing
		
		Division divObj = new Division();
		float [] divisionResult = new float[50];
		float [] remainder = new float[50];
		float [] a ={-42,0,-12,1}; 
		float [] b ={-3,1,0,0}; 
		divObj.polyDivision(a, b, divisionResult, remainder);
		if (divisionResult == null||remainder == null){
			System.out.println("Error in division");
		}
		else{
			System.out.println("The quotient is ");
		    String s = obj.transfPolyToString(divisionResult, divObj.degree(divisionResult)+1);
			System.out.println(s);
			System.out.println("The remainder is ");
		    String s1 = obj.transfPolyToString(remainder, divObj.degree(remainder)+1);
			System.out.println(s1);
		}
	}
}
