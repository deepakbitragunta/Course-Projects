
public class a80 {
	public static int[] ascending(int[] a){

	    int temp;

	    for(int i = 0; i < a.length - 1; i++){
	        for(int j = 0; j < a.length - 1; j++){
	            if(a[j] > a[j+1]){
	                temp = a[j];
	                a[j] = a[j+1];
	                a[j+1] = temp;
	            }
	        }
	    }

	    return(a);
	}

}
