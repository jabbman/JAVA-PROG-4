
//import java.util.Stack;

public class NewStack<E> {
	
	private int stackSize;
	@SuppressWarnings("unchecked")
	private E [] element = (E[]) new Object[40];

	
	public int size() // size
	{
		return 0;
	}
	boolean isEmpty() // if contains value
	{
		return stackSize == 0;
	}
	public E top()// unimplemented
	{
		return null;
	}
	void push(E item) // push method
	{
		element[stackSize] = item;
		stackSize++;
	}
	public E pop() // pop method
	{
		stackSize--;
		return element[stackSize];
		
		//return null;
	}
	public E peek() // peek method
	{
		return element[stackSize];
	}

}