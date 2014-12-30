public class Q71 {

	private static void mergeSort(int[] a, int low , int high,int[] res)
	{
	    int mid = (low + high)  /2;
	    if (low  < high)
	    {
	        mergeSort(a,low,mid-1,res);
	        mergeSort(a,mid,high-1,res);
	        merge(a,low,mid,high,res);

	    }
	}



	   private static void merge(int[] a, int low , int mid , int high,int[] res)
	{

	    int i = low;
	    int j = mid ;

	    int k =0;

	    while (i < mid && j < high)
	        if(a[i] < a[j])
	               res[k++] = a[i++];
	        else
	              res[k++] = a[j++];


	    while(i < mid)
	        res[k++] = a[i++];

	    while(j < high)
	        res[k++] =a[j++];
	}
}