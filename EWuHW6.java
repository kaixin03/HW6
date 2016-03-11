/* Name: Assignment 6
 * Author: Elizabeth Wu
 * Version: 1
 * Source: EWuHw6.java, ThreadExtend, ThreadRunnable
 * Update: 0
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class EWuHW6 
{
	public static void main(String args[])
	{
		String s1 = null, s2 = null;		
		
				//prompt user to enter 2 strings
				System.out.println("Enter String 1: ");
				s1 = readInput(s1);
				System.out.println("Enter String 2: ");
				s2 = readInput(s2);

				//create threads using inputs
				ThreadExtend te1 = new ThreadExtend(s1);
				ThreadExtend te2 = new ThreadExtend(s2);	
				ThreadRunnable tr1 = new ThreadRunnable(s1);
				ThreadRunnable tr2 = new ThreadRunnable(s2);
				
				/* Two concerns: 
				 * 1. How do I make sure main() ends last (after threads finish executing)?
				 * do I use a join() somehow, or an isAlive()? 
				 * 
				 * 2. How do I rewrite this thing so that it's more efficient?
				 * can't I do this w/ 2 threads instead of 4?
				 */
	}
	
	//method readInput reads & returns user input
	private static String readInput(String str)
	{
		String userInput = str;
		BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));

		try 
		{
			userInput = b1.readLine();
			
		} catch (IOException e) {
			System.out.println("Error: IOException, please rerun program");
			e.printStackTrace();
		}
		return userInput;
	}
	
}
