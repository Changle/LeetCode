
public class WidcardMatch {
	
	public boolean isMatch(String s, String p) {
		
		if( s==null || p == null) return false;
		
		if(p.isEmpty()) return s.isEmpty() == true;
		
		if(s.isEmpty()) return p.isEmpty() || allStar(p);
		
		if(p.charAt(0) == s.charAt(0) || p.charAt(0) == '?')
			return isMatch(s.substring(1),p.substring(1));
		
		if(p.charAt(0) == '*')
			return isMatch(s.substring(1),p) || isMatch(s,p.substring(1));
		
		
		return false;
	
	}
	
	public boolean allStar(String str)
	{
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) != '*')
				return false;
		}
		return true;
	}

}
