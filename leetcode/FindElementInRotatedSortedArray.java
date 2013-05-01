
public class FindElementInRotatedSortedArray {
	
	public int indexOfSmallestElement(int A[],int n)
	{
		int L = 0;
		int R = n-1;
		while( A[L] > A[R])
		{
			int M = (L+R)/2;
			if(A[M] > A[R])
				L = M+1;
			else
				R = M;
		}
		return L;
	}

}
