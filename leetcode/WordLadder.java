import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;


public class WordLadder {
	
    public int ladderLength(String start, String end, HashSet<String> dict) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	HashSet<String> set = new HashSet<String>();
    	Queue<String> queue = new LinkedList<String>();
    	
    	queue.offer(start);
    	set.add(start);
    	int distance = 1;
    	int count = 1;
    	
    	while(!queue.isEmpty())
    	{
    		while(count > 0)
    		{
    			String headString = queue.poll();
    			char[] strArray = headString.toCharArray();
    			
    			for(int i = 0; i < strArray.length; i++)
    			{
    				char tmp = strArray[i];
	    			for(char c ='a'; c<='z'; c++)
	    			{
	    				if(tmp == c)
	    					continue;
	    				
	    				strArray[i] = c;
	    				String newStr = strArray.toString();
	    				if(newStr.equals(end))
	    					return distance + 1;
	    				
	    				if(dict.contains(newStr)&&!set.contains(newStr))
	    				{
	    					queue.add(newStr);
	    					set.add(newStr);
	    				}
	    				strArray[i] = tmp;
	    			}
    			}
    			count--;
    		}
    		count = queue.size();
    		distance ++;
    	}
        
    	return distance;
    }
    
    public static void main(String args[])
    {
    	char c[] = {'a','b','c'};
    	System.out.println(c.toString());
    	System.out.println(new String(c));
     }

}
