
public class A62 {
	public static int[] sort(int[] array){
	    int[] newArray = new int[array.length];
	    for (int i = 0; i < (array.length); i++){
	    	for(int j = i+1; j < (array.length); j++){
	            if(array[i]>array[j]){
	                array[j] = newArray[j-1];
	                array[i] = newArray[i+1];
	            }
	        }
	    }
	    for (int idx = 0; idx < array.length; idx++){
	        System.out.println(newArray[idx] + " ");
	    }
	    return array;
	}
}
