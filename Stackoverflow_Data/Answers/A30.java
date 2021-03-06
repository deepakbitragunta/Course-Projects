
public class A30 {

	 int[] quick(int a[],int lower,int upper)
	    {
	       int loc;
	       if(lower<upper)
	       {
	        loc=partition(a,lower,upper);
	        quick(a,lower,loc-1);
	        quick(a,loc+1,upper);

	       }
	       return a;
	    }

	    /* Return type: int
	      Parameters passed: Unsorted array and its lower and upper bounds */

	    int partition(int a[],int lower,int upper)
	    {
	      int pivot,i,j,temp;
	      pivot=a[lower];
	      i=lower+1;
	      j=upper;
	      while(i<j)
	        {
	            while((i<upper)&&(a[i]<=pivot))
	            i++;
	            while((a[j]>pivot))
	            j--;
	            if(i<j)
	                {
	                    temp=a[i];
	                    a[i]=a[j];
	                    a[j]=temp;
	                }

	        }//end while

	        if(pivot>a[j])
	        {
	             temp=a[j];
	             a[lower]=a[lower];
	             a[lower]=temp;
	        }

	         return(j);

	}//end partition
	
}

