
public class PanlindromeInteger {
	
	public boolean isPanlindrome(int x)
	{
		if(x < 0) return false;
		int div = 1;
		
		while(x / div >=10)
			div *= 10;
		
		while(x!=0)
		{
			int l = x / div;
			int r = x % 10;
			if( l!= r) return false;
			x = ( x% div) / 10;
			div /= 100;
		}
		
		return true;
	}
	
	public boolean isPalindrome(Integer x, Integer y)
	{
		if( x < 0) return false;
		if( x == 0) return true;
		if(isPalindrome(x/10, y) && (x%10 == y%10))
		{
			y /= 10;
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		Integer x = new Integer(12321);
		Integer y = new Integer(12321);
		PanlindromeInteger app = new PanlindromeInteger();
		System.out.println(app.isPalindrome(x,y));
	}
	
	

}
