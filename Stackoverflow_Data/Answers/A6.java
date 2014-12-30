
public class A6 {
	public static int partition(int[] A,int low,int high){
	    int pivotIndex=0;
	    int pivot=A[pivotIndex];
	    int i=low;    
	    int temp=A[pivotIndex];
	    A[pivotIndex]=A[high];
	    A[high]=temp;
	    for(int j=low;j<high;j++){
	        if(A[j]<pivot){
	            temp = A[j];
	            A[j]=A[i];
	            A[i]=temp;
	            i++;
	        }
	    }
	    temp=A[high-1];
	    A[high-1]=A[i+1];
	    A[i+1]=temp;
	    return i;
	}
	public static int[] sort(int[] A){
		return Qsort(A,0,A.length);
	}

	public static int[] Qsort(int[] A,int low,int high){
	    if(low<high){
	        int p=partition(A,low,high);
	        Qsort(A,low,p-1);
	        Qsort(A,p+1,high);
	      }
	    return A;
	}


}
