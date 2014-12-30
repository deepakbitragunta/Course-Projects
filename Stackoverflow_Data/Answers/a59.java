public class a59 {
	public static int[] mergeSub(int[] array, int left, int right){
    	if(left<right)
    	{
        int mid = (left+right)/2;
        int[] a = mergeSub(array, left, mid);
        int [] b = mergeSub(array, mid+1, right);
        return merge(a, b);

}
    	int[] arr=new int[1];
    	arr[0]=array[left];
    	return arr;
}

static int[] merge(int[] left, int[] right){
        int index =0; int indexLeft =0; int indexRight=0;
        int[] result = new int[left.length+right.length];

        while(indexLeft<left.length && indexRight<right.length){
                if(left[indexLeft] <= right[indexRight])
                {
                        result[index]=left[indexLeft];
                        index++;
                        indexLeft++;

                }
                else{
                        result[index]=right[indexRight];
                        index++;
                        indexRight++;
                }
        }

        if (indexLeft<left.length){
                while(indexLeft<left.length){
                        result[index]=left[indexLeft];
                        indexLeft++; index++;
                }
        }
        if (indexRight<right.length){
        	while(indexRight < right.length){
                        result[index]=right[indexRight];
                        indexRight++; index++;
                }
        }
        return result;
}
public static void main(String args[]){

        int[] array = {2, 4, 5, 7, 5, 6, 3, 5, 7, 8};
        System.out.println(mergeSub(array, 0, 9));
}}

