package mphasis_practice;

import java.util.*;
public class java1_6
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Calculator");
		System.out.println("Enter 1 to perform Addition of 2 no");
		System.out.println("Enter 2 to perform Subtraction of 2 no");
		System.out.println("Enter 3 to perform Multiplication of 2 no");
		System.out.println("Enter 4 to perform Division of 2 no");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		switch(ch)
		{
		    case 1:
		        	System.out.println("Enter 2 no");
		        	int a=sc.nextInt();
		        	int b=sc.nextInt();
		        	System.out.println("Addition is "+(a+b));
		        	break;
		    case 2:
		        	System.out.println("Enter 2 no");
		        	int c=sc.nextInt();
		        	int d=sc.nextInt();
		        	System.out.println("Subtraction is "+(c-d));
		        	break;
		     case 3:
		        	System.out.println("Enter 2 no");
		        	int e=sc.nextInt();
		        	int f=sc.nextInt();
		        	System.out.println("Multiplication is "+(e*f));
		        	break;
		    case 4:
		        	System.out.println("Enter 2 no");
		        	int g=sc.nextInt();
		        	int h=sc.nextInt();
		        	System.out.println("Division is "+(g/h));
		        	break;
		    default:
		        	System.out.println("Wrong Choice");
		}
	}
}