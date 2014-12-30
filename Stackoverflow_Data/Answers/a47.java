
public class a47 {
    static int[] sort(int[] arr)
    {
	        int k;
	        for(int i = 0; i < arr.length; i++)
	        {
	            for(int j = i; j < arr.length-1; j++)
	            {
	                if(arr[i] < arr[j+1])
	                {
	                	   k = arr[j];
	                       arr[j] = arr[i];
	                       arr[i] = k;
	                }
	            }
	        }
			return arr;   
	    }

}
