
public class Q33 {
		public static void main(String[] args) {
		    int BubArray[] = new int[20]; //{#here are 10000 integers#};
		    System.out.println("Array Before Bubble Sort");
		        for(int a = 0; a < BubArray.length; a++){
		             System.out.print(BubArray[a] + " ");
		        }

		         double timeTaken = bubbleSortTimeTaken(BubArray);
		            bubbleSort(BubArray);
		            System.out.println("");               
		            System.out.println("Array After Bubble Sort");
		    System.out.println("    Time taken for Sort : " + timeTaken + " milliseconds.");                
		            for(int a = 0; a < BubArray.length; a++){
		                    System.out.print(BubArray[a] + " ");
		        }
		}

		private static int[] bubbleSort(int[] BubArray) {

		        int z = BubArray.length;
		        int temp = 0;

		        for(int a = 0; a < z; a++){
		                for(int x=1; x < (z-a); x++){

		                        if(BubArray[x-1] > BubArray[x]){

		                                temp = BubArray[x-1];
		                                BubArray[x-1] = BubArray[x];
		                                BubArray[x] = temp;

		                        }      
		                }
		        }
		        return BubArray;
		}
		public static double bubbleSortTimeTaken(int[] BubArray) {
		long startTime = System.nanoTime();
		    bubbleSort(BubArray);
		long timeTaken = System.nanoTime() - startTime;
		return timeTaken;
		}
}
