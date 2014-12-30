
public class q79 {

		public static int[] sort(int arr_sort[]) {
			  int n = arr_sort.length;
		        int temp = 0;

		        for(int i=0; i<n; i++){
		            for(int j=1; j<(n-1); j++){
		                if(arr_sort[j-1] > arr_sort[j]){
		                    temp = arr_sort[j-1];
		                    arr_sort[j-1] = arr_sort[j];
		                    arr_sort[j] = temp;
		                }
		            } System.out.print(arr_sort[i] + " ");
		        }
				return arr_sort;
		}
	    public static void main(String args[]){

	        int [] arr_sort=new int [] {5, 10, 50, 32, 52, 25};

	        System.out.println("Bubble Sort");
	        System.out.println("Before sorting: ");

	        int x;
	        for (x=0; x<6; x++){
	        System.out.print(arr_sort[x] + " ");
	        }
	        System.out.println();
	        System.out.println("After Sorting");

	      
	}
}
