
public class RegularExpression {
	
	public boolean isMatch(String s, String p) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (p.isEmpty()) {
            return s.isEmpty();
        }
        // next char is not '*': must match current character
        if (p.length() == 1 || (p.length() > 1 && p.charAt(1) != '*')) {
            return ((p.charAt(0) == s.charAt(0)) || 
            (p.charAt(0) == '.' && !s.isEmpty())) && 
            isMatch(s.substring(1), p.substring(1));
        }
        // next char is '*'
       while ((s.length() > 0 && p.charAt(0) == s.charAt(0)) || 
            (p.charAt(0) == '.' && !s.isEmpty())) {
            if (isMatch(s, p.substring(2))) {
                return true;
            }
            s = s.substring(1);
        }
        return isMatch(s, p.substring(2));
    }
/**
 * @param args
 */
public static void main(String[] args) {
    // TODO Auto-generated method stub
	RegularExpression p = new RegularExpression();
    System.out.println(p.isMatch("aa", "a*"));
    System.out.println(p.isMatch("aa", ".*"));
    System.out.println(p.isMatch("ab", ".*"));
    System.out.println(p.isMatch("abb", "c*a*b"));
}

}
