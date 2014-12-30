
public class Q75 {
	public int[] insertionSort(int[] a) {

	    for(int i=0; i<a.length;i++) {
	        int j=i+1;

	        while(a[j] < a[i] && j < a.length) {
	            swap(a[j],a[i]);
	            j--;
	        }
	    }
	    return a;
	}

	public void swap(int a, int b) {
	    int temp;
	    temp = a;
	    a = b;
	    b = temp;
	}
}
