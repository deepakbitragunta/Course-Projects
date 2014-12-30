
public class A66 {
	private static int[] quicksort(int[] list, int low, int high){
	    int pivot = list[low + (high-low)/2];
	    int i = low; 
	    int j = high;
	    while (i <= j) {
	      while (list[i] < pivot) {
	        i++;
	      }
	      while (list[j] > pivot) {
	        j--;
	      }
	      if (i <= j) {
	        int temp = list[i];
	        list[i] = list[j];
	        list[j] = temp;
	        i++;
	        j--;
	      }
	    }
	    if (low < j){
	        quicksort(list, low, j);
	    }
	    if (i < high){
	        quicksort(list, i, high);
	    }
	    
	    return list;

	}
}
