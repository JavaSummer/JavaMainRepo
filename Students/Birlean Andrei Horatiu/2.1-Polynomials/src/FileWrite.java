import java.io.*;

public class FileWrite 
{
    public static void writeToFile(int[] m)
    {   
    	try
    	{
        File f = new File("output.txt");
        PrintWriter out = null;
        if(f.exists() && !f.isDirectory())
        {
        	out = new PrintWriter(new FileOutputStream(new File("output.txt"),true));
        	for (int i = 0;i<m.length;i++)
        	{
        		out.print(m[i] + "X^" + i + "+ ");
        	}
        	out.println();
        	out.close();
        }
        else
        {
        	out = new PrintWriter("output.txt");
        	for (int i = 0;i<m.length;i++)
        	{
        		out.print(m[i] + "X^" + i + "+ ");
        	}
        	out.println();
        	out.close();
        	
        }
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    	
    }
    
    public static void writeToFile(int n)
    {
    	try
    	{
    		  File f = new File("output.txt");
    	        PrintWriter out = null;
    	        if(f.exists() && !f.isDirectory())
    	        {
    	        	out = new PrintWriter(new FileOutputStream(new File("output.txt"),true));
    	        		out.println(n);
    	        	out.close();
    	        }
    	        else
    	        {
    	        	out = new PrintWriter("output.txt");
    	        	
    	        		out.println(n);
    	        	out.close();
    	        	
    	        }
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
    
    public static void writeToFile(String s)
    {
    	try
    	{
    		  File f = new File("output.txt");
    	        PrintWriter out = null;
    	        if(f.exists() && !f.isDirectory())
    	        {
    	        	out = new PrintWriter(new FileOutputStream(new File("output.txt"),true));
    	        	    out.println(s);
    	        	    out.close();
    	        }
    	        else
    	        {
    	        	out = new PrintWriter("output.txt");
    	            out.println(s);
    	        	out.close();
    	        	
    	        }
    	
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
}
