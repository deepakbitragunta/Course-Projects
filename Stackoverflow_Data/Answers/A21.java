
public class A21 {
	
private static <T extends Comparable <T>> 
    
T[] merge(T[] data, int first, int mid, int last)
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
	return data;
}

}
