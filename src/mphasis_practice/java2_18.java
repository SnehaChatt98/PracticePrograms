package mphasis_practice;
import java.util.*;
public class java2_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String email[]= {"sneha.chatterjee@gmail.com","sneha.chatt10@gmail.com","sreejade.sd@gmil.com","sarmichatt@rediff.com","pqr.10@gmail.com"};
	    int f=0;
		System.out.println("enter the email id to be searched");
		String a=sc.next();
		
		for(int i=0;i<email.length;i++)
		{
			if(email[i].equals(a))
			{
				
				f=1;
				break;
			}
				
		}
		if(f==1)
		{
			System.out.println("search successful");
		}
		else
		{
			System.out.println("search unsuccessful");
		}
		
	}

}
