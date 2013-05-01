import java.util.Arrays;

import javax.swing.event.ListSelectionEvent;


public class LengthOfLastWord {
	
    public int lengthOfLastWord(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int length = 0;
    	
    	String[] strArray = s.split(" ");
    	if(strArray.length != 0)
    		length = strArray[strArray.length-1].length();
    	
    	return length;
        
    }
    
    public int lengthOfLastWordBetter(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int start = 0;
    	int lastLength = 0;
    	boolean inword = false;
    	
    	for(int i = 0; i< s.length(); i++)
    	{
    		if(s.charAt(i) == ' ')
    		{
    			if(inword)
    			{
    				lastLength = i - start;
    				inword = false;
    			}    		
    		}else{
    			if(!inword)
    			{
    				start = i;
    				inword = true;
    			}
    		}
    	}
    	
    	if(inword)
    		lastLength = s.length() - start;
    	
    	return lastLength;
        
    }
    
    public int lengthOfLastWordBest(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	boolean inword = false;
    	int count = 0;
    	
    	for(int i = s.length()-1; i>= 0; i--)
    	{
    		if(s.charAt(i) != ' ')
    		{
    			if(!inword)
    			{
    				count = 1;
    				inword = true;
    			}else{
    				count++;
    			}
    		}else{
    			if(inword)
    				return count;
    		}
    			
    	}

    	return count;
 
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "   asb sdgb    fg s    ";
		String[] arr = s.split(" ");
		
		System.out.println(Arrays.asList(arr));

	}

}
