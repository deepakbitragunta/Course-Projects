
public class Q24 {

	public static int[] mergeSort(int[] a, int left,  int lHigh, int right, int rHigh) {  
        int elements = (rHigh - lHigh +1) ;  
        int[] temp = new int[elements];
        int num = left;
      while ((left <= lHigh) && (right <= rHigh)){
       if (a[left] <= a[right]) {
          temp[num] = a[left];
          left++;
        }
        else {
          temp[num] = a[right];
          right++;
        }
       num++;   
      }
     while (left <= right){
        temp[num] = a[left]; // I'm getting an exception here, and is it because of the num???
        left += 1;
        num += 1;  
     }  
     while (right <= rHigh) {
        temp[num] = a[right];
        right += 1;
        num += 1;  
     }  
     for (int i=0; i < elements; i++){
       a[rHigh] = temp[rHigh];
       rHigh -= 1;   
     }
     return a;
	}
}
