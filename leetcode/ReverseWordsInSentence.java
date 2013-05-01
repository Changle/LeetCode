
public class ReverseWordsInSentence {
	
	public static String ReverseWordsInSentence(String str)
	{
		
		char chars[] = str.toCharArray();
		ReverseChars(chars,0,str.length()-1);

		int wordStart = -1;
		
		for(int i=0;i<chars.length;i++)
		{
			if(wordStart == -1 && chars[i] !=' ')
			{
				wordStart = i;
			}
			if(wordStart != -1 && (i == chars.length-1 || chars[i+1] == ' '))
			{
				ReverseChars(chars,wordStart,i);
				wordStart = -1;
			}
		}
		
		
		return new String(chars);
	}
	
	public static void ReverseChars(char[] chars, int i, int j)
	{
		while(i<j)
		{
			char tmp = chars[i];
			chars[i] = chars[j];
			chars[j] = tmp;
			i++;
			j--;
		}
	}
	
	public static void main(String args[])
	{
		String str = "   I am very   good ";
		System.out.println(str);
		System.out.println(ReverseWordsInSentence.ReverseWordsInSentence(str));
	}

}
