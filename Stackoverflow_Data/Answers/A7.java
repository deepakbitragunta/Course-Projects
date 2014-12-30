
public class A7 {
public static void main(String[] args) {
    int BubArray[] = new int[]{};
    System.out.println("Array Before Bubble Sort");
        for(int a = 0; a < BubArray.length; a++){
             System.out.print(BubArray[a] + " ");
        }

         double timeTaken = bubbleSortTimeTaken(BubArray);
               
            for(int a = 0; a < BubArray.length; a++){
                    System.out.print(BubArray[a] + " ");
        }
            int itrs = bubbleSort(BubArray);
            System.out.println("");               
            System.out.println("Array After Bubble Sort");
    System.out.println("    Time taken for Sort : " + timeTaken + " milliseconds.");  
    System.out.println("Time complexity: " + itrs);
}

private static int bubbleSort(int[] BubArray) {

    int z = BubArray.length;
    int temp = 0;

    int itrs = 0;

    for(int a = 0; a < z; a++){
            for(int x=1; x < (z-a); x++){

                    if(BubArray[x-1] > BubArray[x]){

                            temp = BubArray[x-1];
                            BubArray[x-1] = BubArray[x];
                            BubArray[x] = temp;


                    }    

                    itrs++;
            }
    }

    return itrs;
}
public static double bubbleSortTimeTaken(int[] BubArray) {
long startTime = System.nanoTime();
    bubbleSort(BubArray);
long timeTaken = System.nanoTime() - startTime;
return timeTaken;
}
}