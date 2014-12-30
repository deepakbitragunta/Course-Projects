public class q88 {

    int i; 
    int l = 0;

    public void quicksort(int A[], int n) {

        if (n == 1) {
            return;
        } else {
            partition(A, 0, n);
//----Confused as from this point
            quicksort(A, A[i]);

            //Recursively sort both parts of the array
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
class QuickSortApp{
    public static void main(String args[]){
        q88 quick = new q88();
        int A[] = {6,2,7,8,4,3,5};
        quick.quicksort(A,  A.length);
        quick.display(A);
    }
}