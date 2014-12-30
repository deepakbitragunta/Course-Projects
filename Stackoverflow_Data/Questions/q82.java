
public class q82 {

	public static void merge(int[] A, int p, int q, int r) {
	    int lengthOfLeftSubarray = q - p + 1;
	    int lengthOfRightSubarray = r - q;

	    int[] L = new int[lengthOfLeftSubarray + 1];
	    int[] R = new int[lengthOfRightSubarray + 1];

	    for(int i=0; i<lengthOfLeftSubarray; i++) 
	        L[i] = A[p + i];

	    for(int i=0; i<lengthOfRightSubarray; i++) 
	        R[i] = A[q + i];

	    L[lengthOfLeftSubarray] = -1;
	    R[lengthOfRightSubarray] = -1;

	    int i = 0, j = 0;
	    for(int k=p; k<r; k++) {
	        if(L[i] <= R[j]) {
	            A[k] = L[i];
	            i++;
	        }
	        else {
	            A[k] = R[j];
	            j++;
	        }
	    }
	}

	public static void mergesort(int[] A, int p, int r) {
	    if(p < r){
	        int q = (p + r) / 2;
	        mergesort(A, p, q);
	        mergesort(A, q + 1, r);
	        merge(A, p, q, r);
	    }       
	}

}
