public class a52{
	public int[] sorter(int[] numbers,int left, int right)
	{
		MergeSort(numbers,aux,left,right);
		return numbers;
	}
	 int[] aux = new int[100];
	//MergeSort 
    public void MergeSort(int[] numbers, int[] aux, int start, int end){
        if(start==end) return;

        int mid = (int) (start+end)/2 ;
        MergeSort(numbers, aux, start, mid);
        MergeSort(numbers, aux, mid+1, end);

        for(int i=start; i<=end; i++)
            aux[i] = numbers[i];

        int i= start;
        int j= mid+1;

        for(int n=start; n<=end; n++){
            if(i>mid) numbers[n] = aux[j++];
            else if(j>end) numbers[n] = aux[i++];
            else if(aux[i]<aux[j]) numbers[n] = aux[i++];
            else numbers[n] = aux[j++];
        }
    }

    public void Swap(int[] numbers, int i, int j){
        int tmp = numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=tmp;
    }
}