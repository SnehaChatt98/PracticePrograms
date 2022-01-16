package mphasis_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.*;
public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<ArrayList> set = new HashSet<>();
	  	Set<Integer> set1 = new HashSet<>();
	  
	        // create ArrayList list1
	        ArrayList<Integer> list1 = new ArrayList<>();
	  
	        // create ArrayList list2
	        ArrayList<Integer> list2 = new ArrayList<>();
	  
	        // Add elements using add method
	        list1.add(1);
	        list1.add(2);
	        list2.add(3);
	        list2.add(4);
	        set.add(list1);
	        set.add(list2);
	        list1.remove(0);
	       // set.add(list2);
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);
	        // print the set size to understand the
	       System.out.println(set);
	         System.out.println(set1);

	}

}
