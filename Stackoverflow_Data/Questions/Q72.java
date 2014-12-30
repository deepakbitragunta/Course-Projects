
public class Q72 {
	public static void mergesort(int[] S, int left, int right){
	    if (right <= 1) { return; }
	    int mid = (right + left) / 2;
	    mergesort (S, left, mid);
	    mergesort (S, mid+1, right);
	    merge(S, left, mid, right); 
	}

	public static void merge(int[] S, int left, int mid, int right){
	    int i, j;
	    int[] aux = new int[S.length];

	    for (i = mid+1; i > left; i--) {aux[i-1] = S[i-1];}
	    for (j = mid; j < right; j++) {aux[right+mid-j] = S[j+1];}
	    for (int k = left; k <= right; k++){
	        if (aux[j] < aux[i]) {
	            S[k] = aux[j--]; 
	        } else{
	            S[k] = aux[i++];
	        }
	    }
	}
}
