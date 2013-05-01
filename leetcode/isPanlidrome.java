

/* 
 * 一个字符串，里面有字母和一个标点符号，问这个字符串是否是palindrome（标点
不算，比如aa！是palindrome）
*/

public class isPanlidrome {
	
	public static boolean isPanlidrome(String str)
	{
		if(str == null ) return false;
		if(str.equals("")) return false;
		
		int n = str.length() - 1;
		char []chars = str.toCharArray();
		int i = 0;
		
		while(i<n)
		{
			if(chars[i] > 'z' || chars[i] < 'a')
			{
				i++;
				continue;
			}
			
			if(chars[n] > 'z' || chars[n] < 'a')
			{
				n--;
				continue;
			}
			
			if(chars[i]!=chars[n])
			{
				return false;
			}
			i++;
			n--;
		}
		return true;
	}
	
	public static void main(String args[])
	{
		String a = "aa!";
		String b = "aaba";
		String c = "a*bcc!!b92a12";
		
		System.out.println(isPanlidrome.isPanlidrome(a));
		System.out.println(isPanlidrome.isPanlidrome(b));
		System.out.println(isPanlidrome.isPanlidrome(c));

	}

}
