package mphasis_practice;

public class java3_14_1
{
    // Instance Variables
    String name;
    int age;
   
    public java3_14_1(String name, int age)
    {
        this.name = name;
        
        this.age = age;
       
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return("Hi my name is "+ this.getName()+
               ".\nMy age is " + this.getAge());
              
              
    }
 
    public static void main(String[] args)
    {
        java3_14_1 ob = new java3_14_1("tuffy", 5);
        System.out.println(ob.toString());
    }
}
 
