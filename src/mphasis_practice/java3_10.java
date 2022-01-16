package mphasis_practice;

class java3_10 {
    public static void main(String[] args)
    {

        int[] array1 = { 2, 4, 6, 7, 8 };
  

        int[] array2 = { 1, 2, 3, 4, 5 };

        int[] ans = null;
        try {
            for (int i = 0; i < 5; i++) {
                ans[i] = array1[i] / array2[i];
                Integer.parseInt("Welcome to Exception");
            }
        }
        catch (ArithmeticException error) {
            System.out.println(
                "The catch block with Arithmetic Exception is executed");
        }
        catch (NullPointerException error) {
            System.out.println(
                "The catch block with Null Pointer Exception is executed");
        }
        catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(
                "The catch block with Array Index Out Of Bounds Exception is executed");
        }
        catch (NumberFormatException error) {
            System.out.println(
                "The catch block with Number Format Exception is executed");
        }
        
        catch (Exception error) {
            System.out.println(
                "An unknown exception is found "
                + error.getMessage());
        }
  
        System.out.println("End of program");
    }
}