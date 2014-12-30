public class a51 {
    public int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];

        //option 1: brutal force (O(N^2))
        /*
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>=target)
                continue;

            for(int j=i+1; j<numbers.length; j++){
                if(numbers[j]>=target-numbers[i])
                    continue;

                if(numbers[i]+numbers[j]==target){
                    result[0]=i+1;
                    result[1]=j+1;
                    return result;
                }
            }
        }*/

        //option 2: 
        int size = numbers.length;
        int[] numCopies = new int[size];
        for(int i=0; i<size; i++)           //Cost N
            numCopies[i] = numbers[i];

        //QuickSort(numCopies, 0, size-1);    //Cost O(NlgN) //Worst Case O(N^2)
        int[] aux = new int[size];
        MergeSort(numCopies, aux, 0, size-1); //Worst Case 

        int m = FindIndex(numCopies, target, 0, size-1);      //O(lgN)
        int ms = FindIndex(numCopies, (int)target/2, 0, m);   //O(lgN)

        int i=ms;
        int j=ms+1;
        while(true){                            //O(N)
            if(i<0||j>m) break;
            int tmp = numCopies[i]+numCopies[j];
            if(tmp ==target) break;
            else if(tmp>target) i--;
            else j++;
        }

        boolean indexOneSet = false;
        boolean indexTwoSet = false;
        for(int index=0;index <size; index++){  //O(N)
            if(!indexOneSet && (numbers[index]==numCopies[i]||numbers[index]==numCopies[j]))
            {
                result[0] = index+1;
                indexOneSet = true;
            }

            else if(!indexTwoSet && (numbers[index]==numCopies[i]||numbers[index]==numCopies[j]))
            {
                result[1] = index+1;
                indexTwoSet = true;
                break;
            }
        }
        return result;
    }

    //Binary Search 
    public int FindIndex(int[] numbers, int n, int start, int end){
        if(start==end) return start;

        int mid = (int)((start+end)/2);

        if(numbers[mid]==n) return mid;
        else if (numbers[mid] < n && numbers[mid + 1] > n) return mid;
        else if(numbers[mid]>n) return FindIndex(numbers, n, start, mid);
        else return FindIndex(numbers, n, mid+1, end);
    }

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

    //QuickSort 
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