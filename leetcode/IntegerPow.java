
public class IntegerPow {
	
	public static int pow(int x, int y)
	{
		if(y==0) return 1;
		if(y==1) return x;
		
		int mid = y/2;
		int tmp = pow(x,mid);
		if(mid + mid == y)
			return tmp*tmp;
		else
			return tmp*tmp*x;
	}
	
	public static void main(String args[])
	{
		System.out.println(pow(3,4));
	}

}
