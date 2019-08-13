package isBalanced;
/*Method for determining if all parentheses/brackets are closed
Input is a strings of these characters "(){}[]". Any other string not accepted
Valid Inputs: "[](){}", "[{()}]"
Invalid Inputs: "([]", "([)]"*/

import java.util.EmptyStackException;

public class Stack<E> {
	private E[] items;
	private int top;
	private final static int SIZE=16;
	private int capacity;
	
	//Method for defining stack class
	public Stack()
	{
		items = (E[]) new Object[SIZE];
		top = 0;
		capacity = SIZE;
	}

	//Method for pushing new element on stack
	public void push (E s) throws FullStackException
	{
		if(top == capacity)
			throw new FullStackException();
		else
		{
			items[top] = s;
			top++;
			return;
		}
	}
	
	//Method for popping element off the stack
	public E pop () throws EmptyStackException
	{
		if(top == 0)
			throw new EmptyStackException();
		top--;
		return items[top];
	}

	//Method for checking if stack is empty
	public boolean isEmpty()
	{
		if(top == 0)
			return true;
		return false;
	}

	//Method for changing capacity of the stack (default capacity is 16)
	public void changeCapacity(int x)
	{
		capacity = x;
	}

	public static String isBalanced(String str) throws FullStackException
	{
		boolean balanced = true;
		Stack<Character> stack = new Stack<Character>();
		int length = ((String) str).length();
		if(length > 16)
			stack.capacity = length;


		for(int i = 0; i<length; i++)
		{
			if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{')
				stack.push(str.charAt(i));
			if(str.charAt(i) == '}')
			{
				if(stack.isEmpty() == true)
					return("Not balanced");
				Character x = stack.pop();
				if(x != '{')
					balanced = false;
			}
			if(str.charAt(i) == ')')
			{
				if(stack.isEmpty() == true)
					return("Not balanced");
				Character x = stack.pop();
				if(x != '(')
					balanced = false;
			}
			if(str.charAt(i) == ']')
			{
				if(stack.isEmpty() == true)
					return("Not balanced");
				Character x = stack.pop();
				if(x != '[')
					balanced = false;
			}
		}
		if(balanced == true && stack.isEmpty())
			return("Balanced string");
		else
			return("Not balanced");
	}

	public static void main(String[] args) throws FullStackException {
		System.out.println(isBalanced("[]")); //balanced	
		System.out.println(isBalanced("()[]{}")); //balanced
		System.out.println(isBalanced("{[()]}")); //balanced
		System.out.println(isBalanced("[")); //not balanced
		System.out.println(isBalanced("([)]")); //not balanced
		System.out.println(isBalanced("([]")); //not balanced
	}

}