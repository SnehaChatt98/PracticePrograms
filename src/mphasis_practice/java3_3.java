package mphasis_practice;

public class java3_3 extends Thread {
	  public static void main(String[] args) {
	    java3_3 thread = new java3_3();
	    thread.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }
	}