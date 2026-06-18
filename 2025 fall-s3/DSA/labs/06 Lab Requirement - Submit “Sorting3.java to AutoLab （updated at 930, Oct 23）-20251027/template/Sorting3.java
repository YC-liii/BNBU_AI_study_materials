import java.util.*;

public class Sorting3 { /*Comparison of 3 sorting algorithms*/
	public static void insertionSort(int[] A) {
		insertionSort(A, 0, A.length - 1);
	}
	
	private static void insertionSort(int[] A, int left, int right) {
		// This insertionSort is called by quickSort when the sub-array size is small
		for(int p=left + 1; p<=right; p++) {
			int key = A[p];
			int i = p-1;
			while(i>=0 && A[i]>key) {
				A[i+1] = A[i];
				i--;
			}
			A[i+1] = key;
		}
	}
	
	public static void mergeSort(int[] A) {
		mergeSort(A, 0, A.length-1);
	}
	
	private static void mergeSort(int[] A, int left, int right) {
		if(left >= right)
			return;
		int center = (left + right) / 2;
		mergeSort(A, left, center);
		mergeSort(A, center + 1, right);
		merge(A, left, center, right);
	}
	
	private static void merge(int[] A, int left, int center, int right) {
		int i1 = left, i2 = center + 1, i = 0;
		int B[] = new int[right - left + 1];
		while(i1<=center && i2 <= right)
			if(A[i1] < A[i2])
				B[i++] = A[i1++];
			else
				B[i++] = A[i2++];
		while(i1<=center)
			B[i++] = A[i1++];
		while(i2<=right)
			B[i++] = A[i2++];
		for(i=0; i<B.length; i++)
			A[left + i] = B[i];
	}	
	
	public static void quickSort(int[] A) {
		quickSort(A, 0, A.length-1);
	}	

	private static void quickSort(int[] A, int left, int right) {
		/*YOUR CODE HERE*/
	}
	
	private static int partition(int[] A, int left, int right) {
		/*YOUR CODE HERE*/
	}
	
	private static void median3(int[] A, int left, int right) {
		/*YOUR CODE HERE*/
	}
	public static void main(String[] args) {
		/*YOUR CODE HERE, to test the time efficiency of the three sorting methods.	*/
		
	      
	}

}
