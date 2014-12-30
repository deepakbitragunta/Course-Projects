public class Q22 {

/*	* Sorts an array by the "selection sort" method.
	 * Find the position of the smallest element in the array,
	 * swap it with the next unsorted element
	 *
	 * @param  a   the array to sort
	 */
	public static int[] sort(int[] a)
	{
	    for (int n = 0; n < a.length - 1; n++)
	    {
	        int minPos = minimumPosition(a, n);

	        if (minPos != n)
	        {
	            swap(a, minPos, n);
	        }
	    }
	    return a;
	}

	public static int minimumPosition(int[] a, int from)
	{
	    int minPos = from;      
	    for (int i = from + 1; i < a.length; i++)
	    {
	        if (a[i] < a[minPos])
	        {
	            minPos = i;
	        }
	    }
	    return minPos;
	}
	

	private static void swap(int[] a, int minPos, int n) {
		int temp =a[minPos];
		a[n] = temp;
		// TODO Auto-generated method stub
	}

}
