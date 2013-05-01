
public class StringInterleave {
	
	public static boolean isInterleaved(String a, String b, String c)
	{
		if(a == null || b == null || c == null)
			return false;
		
		int i=0;
		int j=0;
		int k = 0;
		
		while(k < c.length())
		{
			if(i < a.length()  && c.charAt(k) == a.charAt(i))
				i++;
			else if(j < b.length()  &&c.charAt(k) == b.charAt(j))
				j++;
			else
				return false;
			
			k++;
		}
		
		if(i != a.length()  || j != b.length() )
			return false;
		
		return true;
		
	}
	
	public static void main(String args[])
	{
		String a = "AB";
		String b = "CD";
		String c ="ACBD";
		String d = "AABCBD";
		System.out.println(isInterleaved(a,b,c));
		System.out.println(isInterleaved(a,c,d));

	}

}
