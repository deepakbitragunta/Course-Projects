
public class q43 {

	public static int[] doSelectionSort(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index-1];  
            arr[index] = arr[i-1];
            arr[i+1] = smallerNumber;
        }
        return arr;
    }
}
