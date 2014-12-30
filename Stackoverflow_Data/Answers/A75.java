
public class A75 {
	public int[] insertionSort(int[] a) {

	    for(int i=0; i<a.length;i++) {
	        int j=i;

	        while(j > 0 && a[j-1] > a[j]) {
	            a = swap(a, j-1, j);
	            j--;
	        }
	    }
	    return a;
	}


	public int[] swap(int[] a, int index1, int index2) {
	    int temp = a[index1];
	    a[index1] = a[index2];
	    a[index2] = temp;
	    return a;
	}
}
