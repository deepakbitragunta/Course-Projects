import java.util.Random;
public class q95 {


    public static void main(String[] args) {
      Random gen = new Random();
      int[] a = new int[20];

      for (int i = 0; i < a.length; i++)
        a[i] = gen.nextInt(100);

      printArray(a);
      quickSort(a,0,19);
    }

     private static void printArray(int[] a){
      for (int i : a)
        System.out.print(i + " ");
      System.out.println("");
    }
      private static int[] quickSort(int a[], int left, int right){
      int i = left, j = right;
      int tmp;
      int pivot = a[(left + right) / 2];
      while (i < j) {
            while (a[i] < pivot)
                  i++;
            while (a[j] > pivot)
                  j--;
            if (i <= j) {
                  tmp = a[i];
                  a[i] = a[j];
                  a[j] = tmp;
                  i++;
                  j--;
        }
    }
    if (left < j)
        quickSort(a, left, j);
    if (i < right)
            quickSort(a, i, right);
    return a;
}
}