import java.util.*;

public class MainClass 
{
   public static void main(String[] args)
   {
	   IO inputFile = new IO();
	   ArrayList<String> contents = new ArrayList<String>();
	   contents = inputFile.readFile("input.txt");
	   MainClass.doCommands(contents);
   }
   
   public static void doCommands(ArrayList<String> commands)
   {   
	   IO output = new IO();
	   IO input = new IO();
	   Functions functions = new Functions();
	   
	   Polynomial p1 = new Polynomial();
	   Polynomial p2 = new Polynomial();
	   
	   p1.coefficients = input.lineToIntArray(commands.get(0));
	   p2.coefficients = input.lineToIntArray(commands.get(1));
	   p1.degree = p1.coefficients.length;
	   p2.degree = p2.coefficients.length;
	   
	   for(int i = 2;i<commands.size();i++)
		{
			switch(commands.get(i))
			{
			case "ADD":
				Polynomial sum = new Polynomial();
				sum = functions.add(p1,p2);
				output.writeToFile("output.txt","The sum of the polynomials is : ");
			    output.writeToFile("output.txt",sum.toString());
			    break;
			case "SUBTRACT":
				Polynomial difference = functions.subtract(p1,p2);
				output.writeToFile("output.txt","The difference of the polynomials is : ");
				output.writeToFile("output.txt",difference.toString());
				break;
			case "MULTIPLY":
				Polynomial product = new Polynomial();
				product = functions.multiply(p1, p2);
			    output.writeToFile("output.txt","The product of the polynomials is : ");
			    output.writeToFile("output.txt",product.toString());
			    break;
			case "EVAL":
				int result = functions.evalN(p1, 4);
				output.writeToFile("output.txt","The result of eval 4 is : " + result);
				break;
			case "MULT_SCAL":
			    Polynomial result2 = new Polynomial();
			    result2 = functions.multScal(p1, 4);
			    output.writeToFile("output.txt","The result of scalar multiplication by 4 is : ");
			    output.writeToFile("output.txt",result2.toString());
			}//END switch
			
     }//END for
  }//END doCommands
}//END MainClass   
