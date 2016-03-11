/* Name: Assignment 6
 * Author: Elizabeth Wu
 * Version: 1
 * Source: EWuHw6.java, ThreadExtend, ThreadRunnable
 * Update: 0
 */
class ThreadRunnable implements Runnable 
{
	Thread thrd;
	private static int ran = 0;
	
	//Construct a new thread.
	ThreadRunnable(String name)
	{
		thrd = new Thread(this, name); //(runnable target, String name) --> thread constructor
		thrd.start();
	}

	public void run() 
	{
		if(ran < 1)
		{
			System.out.println("Thread execution using Implements Runnable");
			ran++;
		}
		
		for(int count = 0; count < 5; count++)
		{
			System.out.println("Implements Loop " + count + ": " + thrd.getName()); //thrd vs. thrd.getName()?
		}
		System.out.println("Test finished for Implements: " + thrd.getName());
	}
}
