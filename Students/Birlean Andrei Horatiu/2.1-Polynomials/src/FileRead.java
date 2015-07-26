import java.io.*;
import java.util.*;



public class FileRead {

  private static String lineOne;
  private static String lineTwo;
  
  public static ArrayList<String> readLines()
  {   
	  try
	  {
	     File fileName = new File("pol.txt");
	     FileReader fileReader = new FileReader(fileName);
	     BufferedReader bufferedReader = new BufferedReader(fileReader);
	     lineOne = bufferedReader.readLine();
	     lineTwo = bufferedReader.readLine();
	  
	     ArrayList<String> command = new ArrayList<String>();
	  
	     String buffer;
	     while((buffer = bufferedReader.readLine()) != null)
	     {
		     command.add(buffer);
	     }
	     
	     return command;
	  
      }
	  catch (IOException e)
	  {
		  e.printStackTrace();	  
	  }

	return null;
	  
	
	  
  }//END readLines method
  
 
  
  public static void printLinesRead()
  {    
	   
	   System.out.println("Polynomials read from file are : ");
	   System.out.println(lineOne);
	   System.out.println(lineTwo);
	   
  }
  
 public static ArrayList<Integer> lineToIntArray(String line)
 {
     ArrayList<Integer> array = new ArrayList<Integer>();
     int buf = 0;
 
     for (int i = 0;i<line.length();i++)
     {   
    	 if(line.charAt(i)!=' ')
    	 {
    		buf = buf*10 +((int)line.charAt(i) - 48); 
    	 }
    	 
    	 if(line.charAt(i) == ' ')
    	 {
    		 array.add(buf);
    		 buf = 0;
    		 
    	 }
     }
     return array;
 }
 
 
 
 public static String getLineOne()
 {
	 return lineOne;
 }
 
 public static String getLineTwo()
 {
	 return lineTwo;
 }
}//END class