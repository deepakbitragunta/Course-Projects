
public class q84 {
	public static int [] BubbleSortAsceMethod(int[] x){
	    int temp;

	    for(int i = 0 ; i < x.length-1 ; i++){
	        for ( int j = 1 ; j < x.length-1 ; j++){
	            if ( x[j-1] < x[j]){
	                temp = x[j-1];
	                x[j-1] = x[j];
	                x[j] = temp;
	            }

	            }
	                }
	        return x;   
	  }
}