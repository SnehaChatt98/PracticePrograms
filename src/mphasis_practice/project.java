package mphasis_practice;
import java.util.*;
import java.io.*;
public class project extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner( System.in);		
		File f2= new File("c:\\dir");
		f2.mkdir();
		int ch=0;
		System.out.println("Welcome to Lockedme.com"+'\n'+"Developed by Sneha Chatterjee");	
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Please enter your choice");	
		while(ch!=3)
		{			
			System.out.println("Enter 1 to view files in ascending order");
       		System.out.println("Enter 2 to add/delete/search files");
            System.out.println("Enter 3 to close the application");
            ch =sc.nextInt();
			switch(ch)
			{
			case 1:
				sort();
				break;
			case 2:
				System.out.println("Enter ADD to ADD a file");
				System.out.println("Enter DELETE to DELETE a file");
				System.out.println("Enter SEARCH to SEARCH a file");
				System.out.println("Enter your choice");
				String ch1= sc.next();
				switch(ch1)
				{
				case "ADD":
					System.out.println("Enter File Name to be added");
					String name=sc.next();
					add(name);
					break;
				case "DELETE":
					System.out.println("Enter File Name to be deleted");
					String name1=sc.next();
					delete(name1);
					break;
				case "SEARCH":
					System.out.println("Enter File Name to be searched");
					String name2=sc.next();
					search(name2);
					break;
				default:
					System.out.println("Wrong Choice");
				}
				break;
			case 3:
				System.out.println("Closing the application");
				System.exit(1);
				break;
			default:
				System.out.println("Wrong Choice");
			}
		}		
	}
	public static void add(String name)
	{
		String s1= name+".txt";
		File f1= new File("dir",s1);
		try
		{
			if(f1.createNewFile())
			{
		
				System.out.println(f1.getName());
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void delete(String name)
	{
		String s1=name+".txt";
		try
        {
            File file = new File("dir",s1);
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
	public static void sort()
	{
		File f3= new File("dir");
		String s[]=f3.list();
		if(s==null)
		{
			System.out.println("Empty Directory");
		}
		else
		{
			for (int i = 0; i < s.length-1; i++) 
			{
				for (int j = i+1; j< s.length; j++) 
				{
					if(s[i].compareTo(s[j])>0)
					{
						String tmp=s[i];
						s[i]=s[j];
						s[j]=tmp;
					}
				}
			}
			for (int k = 0; k < s.length; k++) 
			{
				String f0=s[k];
				System.out.println(f0);
			}
			
		}
	}
	public static void search(String name)
	{
		String n=name+".txt";
		File f3= new File("dir");
		String s[]=f3.list();
		int f=0;
		if(s==null)
		{
			System.out.println("Empty Directory");
		}
		else
		{
			for (int i = 0; i < s.length-1; i++) 
			{
				if(s[i].compareTo(n)==0)
				{
					f=1;
					break;
				}
				
			}
			if(f==1)
			{
				System.out.println("File found");
			}
			else
			{
					System.out.println("File not found");				
			}
				
		}
	}
}
