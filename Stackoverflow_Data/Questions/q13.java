
public class q13 {

	public static int[] sort(int arr[]) {
		 int temp;
         for (int i=0;i<arr.length;i++)
         {  
           for (int j=0;j<arr.length-i;j++ )
           {
             if (arr[j]>arr[j+1])
            {  
                temp=arr[j];
                arr[j+1]=arr[j];
                arr[j+1]=temp;
             }
           }
         } 
   for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i] + " ");
    }
   return arr;
 }
	public static  void main(String[] args) {
	    int []arr={12,23,43,34,3,6,7,1,9,6};
	        {  
	             
	    }

}
}
