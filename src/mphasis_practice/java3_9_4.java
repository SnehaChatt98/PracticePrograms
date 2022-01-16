package mphasis_practice;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class java3_9_4 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("CustomException"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
