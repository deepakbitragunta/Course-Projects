
	import java.io.*;

	public class A39 {

		public static int[] insertionSort(int A[]) {
			int i, j, v, n = A.length;
			 for (i = 2;i < n-1;i++) {
		            v = A[i];
		            j = i;

		            while((j>=1)&&(A[j-1]>v)) /*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: -1*/
		            {
		                A[j] = A[j-1];
		                j--;
		            }

		            A[j] = v;
		        }

		        for(i=0;i<n;i++)
		            System.out.print(A[i]+'\t');
		      
			return A;
		}
	    public static void main(String args[]) throws IOException {
	        int A[] = new int[100];
	        int n;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        n = Integer.parseInt(br.readLine());

	        for(int i=0;i<n;i++) {
	            A[i] = Integer.parseInt(br.readLine());
	        }

	       A = insertionSort(A);

	       
	}

}
