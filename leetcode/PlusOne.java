import java.util.Arrays;


public class PlusOne {
	
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	int carry = 0;
    	int newDigit = 0;
    	
    	for(int i=digits.length-1; i>=0; i--)
    	{
    		if(i==0)
    		{
    			newDigit = digits[i] + carry +1;

    		}else{
    			newDigit = digits[i]+carry;
    		}
    		
			if(newDigit >=10)
			{
				carry = 1;
				newDigit%=10;
				digits[i] = newDigit;
			}else{
				break;
			}
    	}
    	
    	if(carry == 1)
    	{
    		int []result = new int[digits.length + 1];
    		result[0] = 1;
    		for(int i=0;i<digits.length;i++)
    			result[i+1] = digits[i];
    		return result;
    	}
    	
    	return digits;
        
        
        
    }
    
    public int[] plusOneBetter(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	int i = digits.length-1;
    	while(i>=0 && digits[i]==9)
    	{
    		i--;
    	}
    	for(int j = i+1;j<digits.length;j++)
    		digits[j] = 0;
    	
    	if(i == -1)
    	{
    		int []result = new int[digits.length + 1];
    		result[0] = 1;
    		for(int k=0;k<digits.length;k++)
    			result[k+1] = digits[k];
    		return result;
    	}else{
    		digits[i] +=1;
    	}
    	
    	return digits;
        
        
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
