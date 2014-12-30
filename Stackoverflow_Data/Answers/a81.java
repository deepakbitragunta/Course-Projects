
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class a81 {

	    public static void mergeSort(int[] array, int first, int last){
	        int mid;
	        if (first<last){
	            mid = (last + first)/2;
	            mergeSort(array, first, mid);
	            mergeSort(array, mid+1, last);
	            merge(array, first, last);
	        }
	    }

	    public static void merge(int[] array, int first, int last){
	        int mid = (last-first)/2;
	        int[] temp = new int[(last-first + 1)];
	        int a1 = first, a2 = mid + 1, current = 0;
	        while (a1 <=mid && a2<=last){
	            if (array[a1] <= array[a2])
	                temp[current++] = array[a1++];
	            else
	                temp[current++] = array[a2++];
	        }
	        for (int i = a1; i<=mid; i++)
	            temp[current++] = array[i];
	        for (int i = a2; i<=last; i++)
	            temp[current++] = array[i];
	        for (int i =0; i<temp.length; i++)
	            array[first+i] = temp[i];
	    }

	    public static void main(String[] args) throws FileNotFoundException {
	        File file = new File("sort.in");
	        Scanner scan = new Scanner(file);
	        int n1 = scan.nextInt();
	        for (int i = 0; i<n1; i++){
	            int[] array =new int[scan.nextInt()];
	            for (int j = 0; j<array.length; j++){
	                array[j] = scan.nextInt(); 
	            }
	            mergeSort(array, 0, (array.length)-1);
	            for (int j = 0; j<array.length; j++){
	                System.out.println(array[j]); 
	            }
	        }
	    }
	}


