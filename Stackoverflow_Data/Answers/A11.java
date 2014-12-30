
public class A11 {
	 private static int[] selectionSort(int[] arr) { 

	      int  minIndex, tmp; 
	      int n = arr.length; 
	      for (int i = 0; i < n - 1; i++) 
	      { 
	              minIndex = i; 
	              for (int j = i + 1; j < n; j++) 
	                   if (arr[j] < arr[minIndex]) 
	                        minIndex = j; 
	              if (minIndex != i) { 
	                    tmp = arr[i]; 
	                    arr[i] = arr[minIndex]; 
	                    arr[minIndex] = tmp; 
	              } 
	        }
	  return arr; 

	}


}
