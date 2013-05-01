
public class AllValidParenthesis {
	
	public void printParenthesis(int leftRemain, int rightRemain, String currentStr)
	{
		if(rightRemain == 0)
		{
			System.out.println(currentStr);
			return;
		}
		
		if(leftRemain > 0)
		{
			printParenthesis(leftRemain-1, rightRemain, currentStr + "(" );
			
			if(leftRemain > rightRemain)
				printParenthesis(leftRemain, rightRemain-1, currentStr + ")");
		}else
		{
			printParenthesis(leftRemain, rightRemain-1, currentStr+")");
		}
	}

}
