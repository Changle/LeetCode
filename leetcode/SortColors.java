import java.util.Arrays;


public class SortColors {
	
	public void sortColors(int[] A)
	{
		int size = A.length;
		int bottom = 0;
		int top = size - 1;
		for(int i = 0; i <= top ;)
		{
			if(A[i] == 0)
			{
				swap(A,i,bottom);
				bottom ++;
				i++;
			}else if(A[i] == 2)
			{
				swap(A,i,top);
				top --;
			}else
				i++;
		}
	}
	
	public void swap(int a[], int i, int j)
	{
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []sample = {0,1,2,0,1,2,1,2,0,1,1,0};
		System.out.println(Arrays.toString(sample));
		new SortColors().sortColors(sample);
		System.out.println(Arrays.toString(sample));

	}

}
