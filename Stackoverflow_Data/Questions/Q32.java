
public class Q32 {

	public void insertionSort(int a[]) {
	    int key; 
	    int i;   
	    for ( int j = 1; j < a.length; j++ ) {
	        key = a[j];
	        i = j;

	        while ( i > 0 && a[i-1] > key ) {
	            a[i] = a[i-1];
	            i = i - 1;
	        }
	        a[i] = key;
	    }
	}
}
