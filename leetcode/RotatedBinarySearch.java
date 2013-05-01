
public class RotatedBinarySearch {
	
	int rotated_binary_search(int A[], int N, int key){
		
		int L = 0;
		int R = N-1;
		
		while(L<=R)
		{
			int M = L + (R-L)/2;
			if(A[M] == key)
				return M;
			
			if(A[L] <= A[M])
			{
				if(A[L] <= key && key < A[M])
					R = M-1;
				else
					L = M+1;
			}else{
				if(A[M] < key && key <= A[R])
					L = M+1;
				else
					R = M-1;
			}
		}
		
		return -1;
		
	}

}
