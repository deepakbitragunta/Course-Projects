
public class a42 {

public class comp<T> {

}

	public static void main(String[] args)
    {
     
        Integer[] values1 = new Integer[5];

        values1[0] = 7;
        values1[1] = 2;
        values1[2] = 12;
        values1[3] = 4;
        values1[4] = 2;

        for(int index= 0; index <= values1.length-1; ++index)
            {
                System.out.println(values1[index]);
            }
        mergeSort(values1);

     
        for(int index= 0; index <= values1.length-1; ++index)
            {
                System.out.println(values1[index]);
            }



    }

     public static <T extends Comparable<T>> void mergeSort(T[] data)
        {
            mergeSort(data, 0, data.length-1);
        }

        private static <T extends Comparable<T>> void mergeSort(T[] data, int min, int max)
        {
            if(min < max)
            {
                int mid = (min + max)/2;
                mergeSort(data, min, mid);
                mergeSort(data, mid+1, max);
                merge(data, min, mid, max);
            }
        }

        private static <T extends Comparable <T>> 
        void merge(T[] data, int first, int mid, int last)
{
    T[] temp = (T[])(new Comparable[data.length]);

    int first1 = first, last1=mid;
    int first2 = mid+1, last2=last;
    int index = first1;

    while(first1 <= last1 && first2 <= last2)
    {
        if(data[first1].compareTo(data[first2]) < 0)
        {
            // the next line has to use indices that can change during this loop
            temp[index] = data[first1]; // change in this line first->first1
            first1++;
        }
        else
        {
            temp[index] = data[first2];
            first2++;
        }
        index++;
    }

            while(first1 <= last1)
            {
                temp[index] = data[first1];
                first1++;
                index++;
            }

            while(first2 <= last2)
            {
                temp[index] = data[first2];
                first2++;
                index++;
            }

            for(index = first; index <=last; index++)
                data[index] = temp[index];
        }
}
