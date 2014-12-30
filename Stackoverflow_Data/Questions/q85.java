
public class q85 {


	    public static int b[] = {6,2,3,1,9};

	    public void MergeSort(int a[],int left[], int right[]) {

	        int i = 0,j = 0,k = 0;

	        int l = left.length;

	        int r = right.length;
	        int v = a.length;

	        while ( i < l && j < r) {
	            if( left[i] < right[j]) {
	                a[k] = left[i] ;
	                i++;
	            } else {
	                a[k] = right [j];
	                j++;
	            }
	            k++;
	        }
	        while ( i < l ) {
	            a[k] = left[i];
	            k++;
	            i++;

	        }
	        while ( j < r ) {
	            a[k] = right[j];
	            k++;
	            j++;

	        }

	    }

	    public void Merge(int a[], int length) {


	        int n = length;
	        if(n < 2) return;
	        int mid = n/2;

	        int left[] = new int[mid];
	        int right[] = new int[n-mid];
	        for (int i = 0 ; i <mid ; i++) {
	            left[i] = a[i];
	        }
	        for (int i = mid ; i <n ; i++) {
	            right[i-mid] = a[i];
	        }

	        Merge(right,n-mid);
	        Merge(left,mid);
	        MergeSort(b, left, right);

	    }

	   
}
