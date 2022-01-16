package mphasis_practice;

import java.io.File;
import java.io.BufferedReader;
 
// Importing as it converts bits to strings
import java.io.InputStreamReader;
 
public class java3_12_1 {

    public static void main(String args[])
    {
       
        java3_12_1 gfg = new java3_12_1();
        gfg.newFile();
    }
 
    public void newFile()
    {
        String strPath = "", strName = "";
        try {
        	 
            
            BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
            System.out.println("Enter the file name:");
 
           
            strName = br.readLine();
            System.out.println("Enter the file path:");
 
            strPath = br.readLine();
          
            File file1
                = new File(strPath + "" + strName + ".txt");

           if( file1.createNewFile())
        	   System.out.println("Successfully created");
        }
 

        catch (Exception ex1) {
        	System.out.println(ex1);
        }
    }
}
