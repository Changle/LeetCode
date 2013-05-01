
public class OccurrenceOfNumInSortedArray {
	
	public int getOccurrence(int k, int num[], int start, int end)
	{
		if(start > end)
			return 0;
		
		if(num[start] > k)
			return 0;
		if(num[end] < k)
			return 0;
		
		if(num[start] == k && num[end] == k)
			return end-start +1;
		
		int mid = (start + end)/2;
		
		if(num[mid] == k)
			return 1 + getOccurrence(k, num, start, mid -1)
					+ getOccurrence(k, num, mid+1, end);
		else if ( num[mid] > k)
			return getOccurrence(k, num, start, mid-1);
		else
			return getOccurrence(k, num, mid+1, end);
				
	}

}
