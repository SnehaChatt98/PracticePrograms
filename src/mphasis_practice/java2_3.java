package mphasis_practice;

class java2_3 {
	  public int addNumbers(int a, int b) {
	    System.out.println("Function Calling");
	    int sum = a + b;
	    return sum;
	  }

	  public static void main(String[] args) {
	    
	    int num1 = 25;
	    int num2 = 15;

	    java2_3 obj = new java2_3();
	    int result = obj.addNumbers(num1, num2);
	    System.out.println("Sum is: " + result);
	  }
	}
