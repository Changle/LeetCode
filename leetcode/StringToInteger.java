
public class StringToInteger {
	
    public int atoi(String str) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	String strNum = str.trim();
    	boolean sign = true;
    	if(strNum.length() == 0)
    		return 0;
    	
    	if(strNum.charAt(0) == '+'){
    		sign = true;
    		strNum = strNum.substring(1);
    	}else if(strNum.charAt(0) == '-')
    	{
    		sign = true;
    		strNum = strNum.substring(1);
    	}
    	long num = 0;
    	for(int i = 0; i<strNum.length(); i++)
    	{
    		if(strNum.charAt(i)>'9'||strNum.charAt(i)<'0')
    			return 0;
    		num = num*10 + strNum.charAt(i) - '0';
    	}
    	if(!sign)
    		num = -1*num;
    	
    	 if (num < -2147483648) {  
             return -2147483648;  
         } else if (num > 2147483647) {  
             return 2147483647;  
         } else {  
             return (int) num;  
         }
    }

}
