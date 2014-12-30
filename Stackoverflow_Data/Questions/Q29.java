
public class Q29 {

		   public int[] sortArray(int[] x) {//go through the array and sort from smallest to highest
		      for(int i=1; i<x.length; i++) {
		         int temp=0;
		         if(x[i-1] > x[i]) {
		            temp = x[i-1];
		            x[i-1] = x[i];
		            x[i] = temp;
		         }
		      }
		      return x;
		   }

		   public void printArray(int[] x) {
		      for(int i=0; i<x.length; i++)
		        System.out.print(x[i] + " ");
		   }

		   public static void main(String[] args) {
		      // TestBubbleSort
			   Q29 b = new Q29();
		      int[] num = {5,4,3,2,1};
		      b.sortArray(num);
		      b.printArray(num);   
		   }
		
}

