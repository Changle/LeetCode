import java.util.Stack;


public class InfixToPostfix {
	
	public static int getPriority(char c)
	{
		if(c == '+' || c == '-')
			return 1;
		else if(c == '*' || c == '/')
			return 2;
		else if(c == '^')
			return 3;
		else 
			return 0;
	}
	
	public static String Infix2Postfix(String expr)
	{
		if(expr == null) return null;
		if(expr.equals("")) return "";
		
		StringBuilder result = new StringBuilder();
		
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < expr.length(); i++)
		{
			char letter = expr.charAt(i);
			if(expr.charAt(i)>='0' && expr.charAt(i)<='9')
				result.append(expr.charAt(i));
			else if(letter == '(')
				stack.push(letter);
			else if(letter == ')')
			{
				while(!stack.isEmpty() )
				{
					char opearator = stack.pop();
					if(opearator =='(')
						break;
					else
						result.append(opearator);
				}
			}
			else
			{
				int priority = getPriority(letter);
				while(!stack.isEmpty()&& getPriority(stack.peek())>=priority)
				{
					char operator = stack.pop();
					result.append(operator);
				}
				stack.push(letter);
			}
		}
		
		while(!stack.isEmpty())
		{
			result.append(stack.pop());
		}
		
		return result.toString();
		
	}
	
	public static void main(String args[])
	{
		String  str = "3*((4+5)/6+7*8)";
		String result = Infix2Postfix(str);
		System.out.println(result);
		
	}

}
