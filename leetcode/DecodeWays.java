
public class DecodeWays {
	
    public int numDecodings(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	if(s == null || s.equals(""))
    		return 0;
    	
    	int length = s.length();
    	int val[] = new int[length+1];
    	val[length] = 1;
    	
    	for(int i=length -1; i>=0; i++)
    	{
    		
    		if(s.charAt(i)!='0')
    		{
        		val[i] = val[i+1];

    			if(i+1<length-1 && Integer.parseInt(s.substring(i,i+2))<=26)
    				val[i]+=val[i+2];
    		}    				
    	}
    	
    	return val[0];
        
    }

}
