
public class post24 {

public static void mergeSort(int[] array, int left,  int lHigh, int right, int rHigh) {  
    int elements = (rHigh - lHigh +1) ;  
    int[] temp = new int[elements];
    int num = left;
  while ((left <= lHigh) && (right <= rHigh)){
   if (array[left] <= array[right]) {
      temp[num] = array[left];
      left++;
    }
    else {
      temp[num] = array[right];
      right++;
    }
   num++;   
  }
 while (left <= right){
    temp[num] = array[left]; // I'm getting an exception here, and is it because of the num???
    left += 1;
    num += 1;  
 }  
 while (right <= rHigh) {
    temp[num] = array[right];
    right += 1;
    num += 1;  
 }  
 for (int i=0; i < elements; i++){
   array[rHigh] = temp[rHigh];
   rHigh -= 1;   
 }
 
}
}
