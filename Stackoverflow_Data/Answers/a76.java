
public class a76 {
	public static void sortAscending(int[] array)
	{
	    int smallest;


	    for(int i=0;i<array.length-1;i++)
	    {
	        smallest=i;

	        for(int index=i+1;index<array.length;index++)
	        {
	            if(array[index]<array[smallest])
	                smallest =index;


	        }
	        if (i != smallest) swap(array, i,smallest);

	        System.out.printf("%d%n",array[i]);

	    }

	}
	
	  public static void swap(int array[], int first,int second)
	    {
	        int temporary=array[first];
	        array[first]=array[second];
	        array[second]=temporary;
	}

}
