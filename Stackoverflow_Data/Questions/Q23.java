
public class Q23 {

	public static int[] insertionSort(int[] array, int index){
	    if(index < array.length){
	        int j = index;
	        int B = array[index];
	        while ((j > 0) && (array[j-1] > B)){
	            array[j] = array[j-1];
	            j--;
	        }
	        array[j] = B;
	        insertionSort(array, index + 1);
	    }
	    return array;
	}
	
}
