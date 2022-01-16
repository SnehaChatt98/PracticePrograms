package mphasis_practice;

import java.util.*;
class thread_creation extends Thread {
    public void run()
    {
        System.out.print("Welcome to GeeksforGeeks.");
    }
    public static void main(String[] args)
    {
       thread_creation g = new thread_creation(); 
        g.start(); 
    }
}
