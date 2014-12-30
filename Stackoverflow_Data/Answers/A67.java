public class A67
{
	public static int[] insertionSort(int[] input) {

        for (int i = 1; i < input.length; i++) {
            int valueToSort = input[i];
            int j = i;
            while (j > 0 && input[j - 1] > valueToSort) {
                input[j] = input[j - 1];
                j--;
            }//end while loop.
            // insert the element
            input[j] = valueToSort;
        }//end for loop    
        return input;
    }       

    public void printArray(int[] input) 
    { 
        System.out.println(input.toString());
    }
}   