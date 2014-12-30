import java.lang.reflect.Array;


public class q58 {
	public static <E extends Comparable<E>> Object[] mergeSort(E[] array){
	    mergeSortRec(array, 0, array.length-1);
	    return array;
	}

	private static <E extends Comparable<E>> void mergeSortRec(E[] array, int firstIndex, int lastIndex){
	    //base case: if length of array is 1
	    if (firstIndex == lastIndex)
	        //return on void method: terminates method
	        return;

	    //split the array
	    int mid = (firstIndex + lastIndex)/2;
	    //recursive case
	    mergeSortRec(array, firstIndex, mid);
	    mergeSortRec(array, mid+1, lastIndex);
	    merge(array, firstIndex, mid, mid+1, lastIndex );
	}

	private static <E extends Comparable<E>> E[] merge(E[] array, int leftFirst, int leftLast, int rightFirst, int rightLast){
	    //create temporary array whose size equals (rightLast - leftFirst + 1)
	    E tmp[] = (E[]) Array.newInstance(array.getClass().getComponentType(), rightLast - leftFirst + 1);
	    int indexLeft = leftFirst;
	    int indexRight = rightFirst;
	    int index = 0;

	    while(indexLeft < leftLast && indexRight < rightLast){
	        //left half element is smaller
	        if (array[indexLeft].compareTo(array[indexRight]) < 0){
	            tmp[index] = array[indexLeft];
	            indexLeft++;
	        }
	        //right half element is smaller
	        else{
	            tmp[index] = array[indexRight];
	            indexRight++;
	        }
	        index++;
	    }
	    //add remaining elements to list
	    while(indexLeft < leftLast){
	        tmp[index] = array[indexLeft];
	        indexLeft++;
	        index++;
	    }
	    while(indexRight < rightLast){
	        tmp[index] = array[indexRight];
	        indexRight++;
	        index++;
	    }
	    //copy tmp to list
	    System.arraycopy(tmp, 0, array, 0, tmp.length);
	    return array;
	}
}
