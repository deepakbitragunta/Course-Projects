
public class Q11 {

	static int[] selectionSort(int[] dataArray)
    {
        int min = Integer.MIN_VALUE;
        int arraySize = dataArray.length;
        int n = 0;
        for(int I=0; I<arraySize; I++)
        {

            min = dataArray[I];
            for(int j=I; j<n; j++)
            {
                if(dataArray[min]<dataArray[j])
                  {
                        min = j;
                        if(dataArray[min] < dataArray[I])
                        {
                            int temp = dataArray[I];
                            dataArray[I] = dataArray[min];
                            dataArray[min] = temp;
                        }
                  }
            }
        } 
        return dataArray;
    }
}
