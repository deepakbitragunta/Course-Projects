

public class a88 {

    int i; 
    int l = 0;

    public void quicksort(int A[], int begin, int end) {

    	if (end-begin <= 1) {
    	    return;
    	} else {
    	    int pivot = partition(A, begin, end);
    	    quicksort(A, begin, pivot);
    	    quicksort(A, pivot, end);
    	}
    }

    public int partition(int A[], int l, int r) {
        int p = A[l];//Choose pivot
        i = l + 1;
        //Partition around A through P
        for (int j = i; j < r; j++) {
            if (A[j] < p) {
                swap(A, i, j);
                ++i;
            }
        }
        swap(A, l, i - 1 );
        return i;
    }

    public void swap(int A[], int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public void display(int A[]){
        for (int i = 0; i < A.length; i ++){
            System.out.print(A[i] + " ");
        }
    }
}


