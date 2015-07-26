import java.util.*;


public class Polynomials 
{
	public static void main(String[] args)
	  {   
		 ArrayList<String> commands = new ArrayList<String>();
		 commands = FileRead.readLines();
		 doCommands(commands);
		 
	  }
	
	public static void doCommands(ArrayList<String> commands)
	{
		for(int i = 0;i<commands.size();i++)
		{
			switch(commands.get(i))
			{
			case "ADD":
				int sum[] = Functions.add(FileRead.lineToIntArray(FileRead.getLineOne()), FileRead.lineToIntArray(FileRead.getLineTwo()));
				FileWrite.writeToFile("The sum of the polynomials is : ");
			    FileWrite.writeToFile(sum);
			    break;
			case "SUBTRACT":
				int difference[] = Functions.subtract(FileRead.lineToIntArray(FileRead.getLineOne()), FileRead.lineToIntArray(FileRead.getLineTwo()));
				FileWrite.writeToFile("The difference of the polynomials is : ");
				FileWrite.writeToFile(difference);
				break;
			case "MULTIPLY":
				int product[] = Functions.multiply(FileRead.lineToIntArray(FileRead.getLineOne()), FileRead.lineToIntArray(FileRead.getLineTwo()));
			    FileWrite.writeToFile("The product of the polynomials is : ");
			    FileWrite.writeToFile(product);
			    break;
			case "EVAL":
				int result = Functions.evalN((FileRead.lineToIntArray(FileRead.getLineOne())), 4);
				FileWrite.writeToFile("The result of eval 4 is : ");
				FileWrite.writeToFile(result);
				break;
			case "MULT_SCAL":
			    int resultt[] = Functions.multScal((FileRead.lineToIntArray(FileRead.getLineOne())), 4);
			    FileWrite.writeToFile("The result of scalar multiplication by 4 is : ");
			    FileWrite.writeToFile(resultt);
			}
			
			
		}
	}
}
