
public class LongestPalindrome {
	
	public static String LongestPalindromeImprove(String in)
	{
		char[] input = in.toCharArray();
		int longestStart = 0;
		int longestEnd = 0;//we also need global start/end to keep track of the current best as we process
		//now the key is to scan from mid to both ends
		for(int mid=0; mid<input.length;mid++)//we name it as mid for easy interpretation
		{
			//for odd case
			int left = mid;
			int right = mid;//for example 12321 when we choose 3 as mid
			while(left>=0 && right<input.length)//make sure both indexes are valid
			{
				if(input[left]==input[right])//if still palindrome match by one step further each loop cycle
				{
					//we need decide if to update global start/end
					if(right-left>longestEnd-longestStart)//the longer is found!
					{
						longestStart = left;
						longestEnd = right;
					}
				} else break;
				left--;
				right++;//sorry added in wrong place, should be in either case per mid choice
			}
			
			//well for even case we need replicate the previous code by making one change
			left = mid;
			right = mid+1;//for example 123321 when we choose 33 as mid
			while(left>=0 && right<input.length)//make sure both indexes are valid
			{
				if(input[left]==input[right])//if still palindrome match by one step further each loop cycle
				{
					//we need decide if to update global start/end
					if(right-left>longestEnd-longestStart)//the longer is found!
					{
						longestStart = left;
						longestEnd = right;
					}
				}
				left--;
				right++;
			}
			//do not forget to increase right and decresea left!!!
			
		}
		//after the loop we return
		return in.substring(longestStart, longestEnd+1);
		//notice we play with all valid indexes for longestEnd while substring 
		//method return the substring ending before the endindex
	}
}
