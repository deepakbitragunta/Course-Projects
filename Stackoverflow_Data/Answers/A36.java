
public class A36 {

	public static int[] insertionSort(int a[]) {
		 // Loop through the entire array length. Consider you already have one
        // element in array, start comparing with
        // first element
        for (int j = 1; j < a.length; j++) {
            // Get the key (The value that needs to be compared with existing
            // values.
            int key = a[j];
            // Get the array index for comparison, we need to compare with all
            // other elements in the array with
            // key
            int i = j - 1;
            // While i > 0 and when key is less than the value in the array
            // shift the value and insert
            // the value appropriately.
            //System.out.println(j);
            while (i >= 0 && a[i] < key) {
                a[i + 1] = a[i];
                i = i - 1;
                a[i + 1] = key;
            }
        }
        return a;
	}
    public static void main(String args[]) {
        int[] a = { 1,10,11,5, 9, 3, 2, 4 };
       
        for (int k = 0; k < a.length; k++) {
            System.out.println(a[k]);
        }
    }

}
