
public class Q28 {
	
	int[] selectionSort() {
		
		int [] arr = {5,4,3,2,1}; // This is my array
	    int min = 0;

	    for(int i = 0;i<arr.length;i++)
	    {
	        //Assume first element is min
	        min = i;//Selection sort algorithm says that find the minimum in the
	                // array, but first element is not minimum.What's point here?
	        for(int j = i + 1;j<arr.length;j++)
	        {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            System.out.println(arr[i]);//I print the in ascending order 
	        }
	    }
	   return arr;
	}
}
