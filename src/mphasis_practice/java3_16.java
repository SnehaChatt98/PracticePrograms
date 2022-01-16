package mphasis_practice;


import java.io.File;  
import java.io.FileNotFoundException;
import java.io.FileWriter;   
import java.io.IOException;  
import java.util.Scanner; 

public class java3_16 {
  public static void readFile(String directory,String filename) {
    try {
    	
      File myObj = new File(directory,filename+".txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  public static void writeFile(String directory,String filename, String data) {
	  try {
		  String path = directory+"/"+filename+".txt";
	      FileWriter myWriter = new FileWriter(path);
	      myWriter.write(data);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
  }
  public static void appendFile(String directory,String filename, String data) {
	  try {
		  String path = directory+"/"+filename+".txt";
	      FileWriter myWriter = new FileWriter(path,true);
	      myWriter.write(data);
	      myWriter.close();
	      System.out.println("Successfully appended to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
  }
  public static void main(String args[]) {
	 String directory = "dir";
  	 String filename = "PQR";
  	 readFile(directory,filename);
  	 writeFile(directory,filename,"Hey!");
  	 appendFile(directory,filename,"Sneha");
  }
}