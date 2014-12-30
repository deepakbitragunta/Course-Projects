
public class A97 {
	public static void quickSort(int[] data, int first, int n)
	{
	    int p, n1, n2;
	    if(n > 1)
	    {
	        p = partition(data, first, n);
	        n1 = p - first;
	        n2 = n - n1 - 1;
	        quickSort(data, first, n1);
	        quickSort(data, p+1, n2);
	    }
	}

	public static void quickSort(int[] data)
	{
	    quickSort(data, 0, data.length);
	}

	private static int partition(int[] A, int first, int n )
	{
	    int right = first + n - 1;
	    int ls = first;
	    int pivot = A[first];
	    for(int i = first+1; i <= right; i++)
	    {
	        if(A[i] <= pivot)
	        // Move items smaller than pivot only, to location that would be at left of pivot
	        {
	            ls++;
	            swap(A, i, ls);
	        }
	    }
	    swap(A, first, ls);
	    return ls;
	}

	private static void swap(int[] data, int pos1, int pos2)
	{
	    int temp = data[pos1];
	    data[pos1] = data[pos2];
	    data[pos2] = temp;
	}
}
