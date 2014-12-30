
public class q78 {

    public int[] sorting(int[] a){
        int value;
        int j;

        for (int i = 1; i < a.length; i++){
            value = a[i];
            j = i-1;

            while( j>=0 && a[j]>= value ){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = value;
        }
        return a;
    }

    public static int[] merge(int[] A, int[] B) {
        int size = A.length + B.length;
        int C [] = new int [size];
        int i, a = 0, b = 0;

        for(i=0; i<size; i++){
            if(a == A.length){
                C[i] = B[b];
                ++b;
            } else if(b == B.length){
                C[i] = A[a];
                ++a;
            } else if(A[a] > B[b]) {
                C[i]=B[b];
                ++b;
            } else {
                C[i] = A[a];
                ++a;
            }
        }

        return C;
    }

   
}
