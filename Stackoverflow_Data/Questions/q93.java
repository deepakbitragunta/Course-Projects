
public class q93 {

	public static int [] sort(int arr_sort[]) {
		int temp, n = arr_sort.length;
		
		for(int i = 0; i < n; i++) {
		    for(int j = i; j < n; j++) {
		        if(arr_sort[j] < arr_sort[i]) {
		            temp = arr_sort[i];
		            arr_sort[i] = arr_sort[j];
		            arr_sort[j] = temp;
		        }
		    } 
		}
		return arr_sort;
	}

}


