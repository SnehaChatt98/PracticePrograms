package mphasis_practice;

public class thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread r=new MyThread();
		Thread t=new Thread(r);
		t.start();
//		t.yield();
		try {
		
		t.join();
		}
		catch(Exception e)
		{
			
		}
		System.out.println("i am main Thread");
	}

}
class MyThread implements Runnable 
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
			try
			{
			Thread.sleep(200);
			}
			catch(Exception e)
			{
			}
		}
	}
}

