package mphasis_practice;
import java.util.*;
public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee obj1=new Employee("Abc",10);
		    Employee obj2=new Employee("Xyz",30);
		    Employee obj3=new Employee("Pqr",20);
			TreeSet <Employee>t1=new TreeSet<>();
			t1.add(obj1);
			t1.add(obj2);
			t1.add(obj3);
		  for( Employee e:t1)
		  {
			  System.out.println(e.name+""+e.id);
			  
		  }
		     
		}
	}
	class Employee implements Comparable
	{
	    String name;
	    int id;
	    Employee(String n, int id)
	    {
	        name=n;
	        this.id=id;
	    }
	   public int compareTo(Object obj)
	    {
	        int eid1= this.id;
	        Employee e=(Employee)obj;
	        int eid2= e.id;
	        if(eid1<eid2)
	        {
	            return -1;
	        }
	        else if(eid1>eid2)   
	        {
	            return 1;
	        }
	        else 
	        {
	            return 0;
	        }
	    }
	}
