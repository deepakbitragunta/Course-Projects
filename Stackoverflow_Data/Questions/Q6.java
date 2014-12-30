
public class Q6 {
	public static int partition(int[] A,int low,int high){
	    int pivot=A[high-1];
	    int i=low-1;
	    int temp=0;
	    for(int j=low;j<A.length-1;j++){
	        if(A[j]<pivot){
	            i++;
	            temp = A[j];
	            A[j]=A[i];
	            A[i]=temp;
	        }
	    }
	    temp=A[high-1];
	    A[high-1]=A[i+1];
	    A[i+1]=temp;
	    return i+1;
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
	
	public static void main(String[] args){
		int[] a={8,7,6,5,4,3,2,1};
		int[] b=sort(a);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]);
	}


}
