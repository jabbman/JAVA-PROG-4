import java.util.Stack;
import java.util.*;


/**
 * COSC 310		Assignment 4
 * Prog5.java
 * 3/5/15
 * A client class that receives a post-fix expression in the 
 * string format and returns a integer via a stack. 
 *

 */

public class Prog4
{
	private String newPostFixInput;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("STACK TESTER...");
		
		Stack<Integer> stackTest = new Stack<Integer>();
		
		stackTest.push(42);
		stackTest.push(35);
		stackTest.push(28);
		stackTest.push(21);
		stackTest.peek();
		
		
		while(!stackTest.isEmpty()){
			System.out.println(stackTest.pop());
			
		}
		//
		Scanner input = new Scanner(System.in);
		
		//user input requested
		System.out.println("\nPlease enter EVENLY SPACED eval postfix equation as a string. ");
		
		System.out.println(" ");
		String newPostFixInput = input.nextLine();
		
		EvalPostFixer s = new EvalPostFixer(newPostFixInput);
		System.out.println("answer is  "+ s.evaluate());
		
	}

}
