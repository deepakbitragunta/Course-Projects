public class a50 {
	 //QuickSort 
	public int[] sorter(int[] numbers,int left, int right)
	{
		QuickSort(numbers,left,right);
		return numbers;
	}
	
    public void QuickSort(int[] numbers,int left, int right)
    {
        if(left>=right) return;
        if(left+1==right){
            if(numbers[left]>numbers[right])
                Swap(numbers,left, right);
            return;
        }

        int i=left+1;
        int j=right;
        while(i<j){
            while(numbers[i]<=numbers[left] && i<j) i++;
            while(numbers[j]>numbers[left] && j>i) j--;
            Swap(numbers,i, j);
        }
        Swap(numbers,left, i);
        QuickSort(numbers, left, i-1);
        QuickSort(numbers, i+1, right);
    }

    public void Swap(int[] numbers, int i, int j){
        int tmp = numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=tmp;
    }

}