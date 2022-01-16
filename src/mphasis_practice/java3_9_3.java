package mphasis_practice;

public class java3_9_3
{
    void Division() throws ArithmeticException
    {
        int a=45,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
     public static void main(String[] args)
    {
    	 java3_9_3 T = new java3_9_3();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("\nError : " + Ex.getMessage());
        }
         finally
         {
        	 System.out.print("\n"+"executing finally block");
         }
    }
}

