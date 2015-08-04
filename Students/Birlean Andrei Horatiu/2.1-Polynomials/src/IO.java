import java.io.*;
import java.util.*;


public class IO
{
   public  ArrayList<String> readFile(String fileName)
   {   
	   try
	   {
	   File newFile = new File(fileName);
	   FileReader fileReader = new FileReader(newFile);
	   BufferedReader bufferedReader = new BufferedReader(fileReader);
	   
	   ArrayList<String> lines = new ArrayList<String>();
	   
	   lines.add(bufferedReader.readLine());
	   lines.add(bufferedReader.readLine());
	   String buffer;
	   while((buffer = bufferedReader.readLine()) != null )
	   {
		   lines.add(buffer);
	   }
	   bufferedReader.close();
	   return lines;
	   }
	   catch(IOException e)
	   {
		   e.printStackTrace();
	   }
	   
	   return null;
	   
   }//END readFile method
   
   public void writeToFile(String fileName,String s)
   {
   	try
   	{
   		  File f = new File(fileName);
   	        PrintWriter out = null;
   	        if(f.exists() && !f.isDirectory())
   	        {
   	        	out = new PrintWriter(new FileOutputStream(new File(fileName),true));
   	        	    out.println(s);
   	        	    out.close();
   	        }
   	        else
   	        {
   	        	out = new PrintWriter(fileName);
   	            out.println(s);
   	        	out.close();
   	        	
   	        }
   	
   	}
   	catch(IOException e)
   	{
   		e.printStackTrace();
   	}
   	
   }//END writeToFile method
   
   public int[]  lineToIntArray(String line)
   {
       StringTokenizer st = new StringTokenizer(line," ");
       int result[] = new int[st.countTokens()];
       int i = 0;
       while (st.hasMoreElements()) 
       {
           result[i] = Integer.parseInt((String) st.nextElement());
           i++;
       }
       return result;
   }//END lineToIntArray method
   
   
}//END IO class
