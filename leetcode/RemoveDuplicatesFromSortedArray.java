public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A.length == 0)
			return 0;

		int last = A[0];
		int length = 1;
		for (int i = 1; i < A.length; i++) {

			if (A[i] != last) {
				A[length++] = A[i];
				last = A[i];
			}

		}
		return length;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
