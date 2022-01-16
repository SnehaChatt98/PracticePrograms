package mphasis_practice;

abstract class Animal {
	  
	  public abstract void animalSound();
	  
	  public void sleep() {
	    System.out.println("Zzz");
	  }
	}

	
	class Pig extends Animal {
	  public void animalSound() {
	   
	    System.out.println("The pig says: wee wee");
	  }
	}

	class java3_14_3 {
	  public static void main(String[] args) {
	    Pig myPig = new Pig(); 
	    myPig.animalSound();
	    myPig.sleep();
	  }
	}