package mphasis_practice;

class java2_5{
	  private String name;
	  java2_5() {
	    System.out.println("Constructor Called:");
	    name = "Constructor";
	  }

	  public static void main(String[] args) {
	    java2_5 obj = new java2_5();
	    System.out.println("The name is " + obj.name);
	  }
	}
