package mphasis_practice;

	import java.io.*;
	  
	public class java3_12_4
	{
	    public static void main(String[] args)
	    {
	    	String name = "ABC";
	    	String directory = "dir";
	    	String s1=name+".txt";
			try
	        {
	            File file = new File(directory,s1);
	            if (file.delete())
	            {
	            	System.out.println("Deleted Successfully");
	            }
	            else
	            {
	            	System.out.println("File Not Found");
	            }
	            
	            	
	        }
	        catch(Exception e)
			{
	        	System.out.println(e);
			}
	    }
	}

