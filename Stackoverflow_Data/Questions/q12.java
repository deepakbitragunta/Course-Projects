
public class q12 {

		public static int[] sort(int arr[]) {
			int  i, j, n, temp; 
			n = arr.length;
		       
		        for (i = 0; i <= n-1; i++) {
		            for (j = i + 1; j <= n; j++) {
		                if (arr[i] > arr[j]) {
		                    temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }
		        for (i = 0; i <= n; i++) {
		            System.out.println(arr[i]);
		        }
		       return arr;
		    }
		
}
