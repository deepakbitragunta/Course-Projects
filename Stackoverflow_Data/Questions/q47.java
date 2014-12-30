
public class q47 {

	    static int[] sort(int[] arr)
	    {
	        int k;
	        for(int i = 0; i < arr.length; i++)
	        {
	            for(int j = i; j < arr.length-1; j++)
	            {
	                if(arr[i] < arr[j+1])
	                {
	                    k = arr[j+1];
	                    arr[j+1] = arr[i];
	                    arr[i] = k;
	                }
	            }
	        }
			return arr;   
	    }

}
