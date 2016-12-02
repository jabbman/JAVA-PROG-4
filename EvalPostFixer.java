import java.util.*;


/**
 * Breaks down string input by user
 * by post fix notation .
 * 
 * @author BARI
 *
 */
public class EvalPostFixer
{
	private String postFix;
	
	public EvalPostFixer(String postFix)
	{
		this.postFix = postFix;
	}
		public int evaluate()
	{
				NewStack<Integer> stack = new NewStack<Integer>();
		//separates string into  token arrays
		
		String [] token = getPostFix().split("\\s+");
		@SuppressWarnings("unused")
		int count = 0;
		int answer = 0;
		int number;
		
		
		for (int i = 0; i < token.length; i++ )
		{
			if (isInteger(token[i]))
			{
				number = Integer.parseInt(token[i]);
				stack.push(number);
				
		}else
			{
			switch (token[i])
			
			{

			case "-":
				while (stack.isEmpty() == false)
				{
					answer = stack.pop() - stack.pop();
				}
				stack.push(answer);
				answer = 0;
				break;
			
			case  "+":
				while (stack.isEmpty() == false)
				{
					
					answer = stack.pop() +stack.pop();
				}
			
				stack.push(answer);
				answer = 0;
				break;
				
					
			case "/":
				while (stack.isEmpty() == false)
				{
					answer = stack.pop() / stack.pop();
					
				}
				stack.push(answer);
				break;
				
			case "*":
				while (stack.isEmpty() == false)
				{
					answer = stack.pop() * stack.pop();
					
				}
				stack.push(answer);
				break;
			}
		}	
	}
	return stack.pop();
	
}
public String getPostFix()
{
	
return postFix;

}

	public boolean isInteger(String tokenDelivered)
	{
		boolean isInteger = true;
		try
		{
			int number = Integer.parseInt(tokenDelivered);
		}
		catch(NumberFormatException e)
		{
			isInteger = false;
		}
		return isInteger;
	}
}