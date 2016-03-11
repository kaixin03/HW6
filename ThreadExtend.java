/* Name: Assignment 6
 * Author: Elizabeth Wu
 * Version: 1
 * Source: EWuHw6.java, ThreadExtend, ThreadRunnable
 * Update: 0
 */
class ThreadExtend extends Thread
{
	//Thread thrd; //only needed for Runnable interfaces
	private static int ran = 0;
	
	//Construct a new thread.
	ThreadExtend(String name)
	{
		super(name); //call Thread constructor, as opposed to xxx(runnable target, String name) for implements Runnable
		start();
	}
	
	public void run()
	{
		if(ran < 1)
		{
		System.out.println("Thread Execution using Extends Thread");
		ran++;
		}
		
		for(int count = 0; count < 5; count++)
		{
			System.out.println("Extends Loop " + count + ": " + getName()); //thrd vs. thrd.getName()?
		}
		System.out.println("Test finished for Extends: " + getName());
	}
}
