public class q77 {

	public static int[] sort(int numberSort[]) {
	 	for(int i =1; i< numberSort.length-1;i++){
	        int temp = numberSort[i];
	        int j = i-1;
	        while((j >= 0) && (numberSort[j]>temp)){
	            numberSort[j+1] = numberSort[j];
	            j = j-1;
	        }
	        numberSort[j+1] = temp;          
	    }
		return numberSort;
	}
}
