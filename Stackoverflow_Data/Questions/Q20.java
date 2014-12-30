
public class Q20 {
	public static int[] qsort(int[] a, int si, int ei){

	    //base case
	    if(ei<=si || si>=ei){}


	    else{ 
	        int pivot = a[si]; 
	        int length = ei - si + 1; 
	        int i = si+1; int tmp; 

	        //partition array 
	        for(int j = si+1; j<length; j++){
	            if(pivot > a[j]){
	                tmp = a[j]; 
	                a[j] = a[i]; 
	                a[i] = tmp; 

	                i++; 
	            }
	        }

	        //put pivot in right position
	        a[si] = a[i-1]; 
	        a[i-1] = pivot; 

	        //call qsort on right and left sides of pivot
	        qsort(a, 0, i-2); 
	        qsort(a, i, a.length-1); 
	    }
	    return a;
	}
}
