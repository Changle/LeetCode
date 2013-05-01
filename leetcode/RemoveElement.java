
public class RemoveElement {
	
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	int last = A.length - 1;
    	int i;
    	for(i = 0; i < A.length; i++)
    	{
    		if(A[i] == elem)
    		{
    			while(last >=0 && A[last] == elem)
    				last--;
    			
    			if( last<0 || i >= last)
    			{
    				break;
    			}
    			
    			int tmp = A[i];
    			A[i] = A[last];
    			A[last] = tmp;
    			last --;
    		}
    	}
    	
    	return i ; 
        
    }
    
    public int removeElementBetter(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
    	
    	int length = 0;
    	for(int i = 0; i < A.length; i++)
    	{
    		if(A[i]!=elem)
    		{
    			A[length++] = A[i];
    		}
    	}
    	
    	return length ; 
        
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []A = {1}; //,2,3,4,4,2,2,6,7,2};
		int elem = 1;
		RemoveElement app = new RemoveElement();
		int result = app.removeElement(A, elem);
		
		for(int i = 0;i <A.length;i++)
			System.out.print(A[i]+" ");
		
		System.out.println();
		System.out.println(result);

	}

}
