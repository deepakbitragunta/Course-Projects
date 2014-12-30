
public class a13 {
	    public static void main(String[] args)
	    {
	        int[] arr={4,6,4,2,764,23,23};
	        sort(arr);
	    }
	    static void sort(int[] arr)
	    {
	        int k;
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=i;j<arr.length-1;j++)
	                {
	                    if(arr[i]<arr[j+1])
	                    {
	                        k=arr[j+1];
	                        arr[j+1]=arr[i];
	                        arr[i]=k;
	                    }
	                }
	            System.out.print(arr[i]+" ");
	        }   
	    }
}


