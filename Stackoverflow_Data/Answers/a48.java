
public class a48 {
	public int[] insertion_sort_with_moves(int[] arr){
	    for (int i = 1; i <= arr.length; i++){
	        int v = arr[i-1];
	        int j = i-1;
	        for (/*declared j outside loop*/; j > 0; j--) {
	            //compswap(a[j-1], a[j]);
	            if (v < arr[j-1]) arr[j] = arr[j-1];
	            else break;
	        }
	        arr[j] = v;
	    }
		return arr;
	}
}