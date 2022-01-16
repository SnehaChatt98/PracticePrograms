package mphasis_practice;
import java.io.*;
import java.util.*;
 
// A class 'Movie' that implements Comparable
class Movie implements Comparable
{ 
    public double rating;
    public String name;
    int year;
  public Movie(String nm, double rt, int yr)
    {
         this.name = nm;
        this.rating = rt;
        this.year = yr;
    }
    // Used to sort movies by year
  public int compareTo(Object obj)
    {
        int y1= year;
        Movie m=(Movie)obj;
        int y2=m.year;
        if(y1<y2)
        {
            return -1;
        }
        else if(y2<y1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
 
    // Constructor
   
 
    // Getter methods for accessing private data
   /* public double getRating() { return rating; }
    public String getName()   {  return name; }
    public int getYear()      {  return year;  }*/
}
 
// Driver class
class comparable_comparator
{
    public static void main(String[] args)
    {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
 
      Collections.sort(list);
        System.out.println("Movies after sorting : ");
        for (Movie movie: list)
        {
            System.out.println(movie.name + " " +
                               movie.rating+ " " +
                               movie.year);
        }
    }
}
    