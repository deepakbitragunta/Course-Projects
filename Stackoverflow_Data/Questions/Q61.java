public class Q61 {
    public static int a[] = {6, 4, 9, 3, 1, 7};

    public static int[] main(String[] args) {
        int min, i, j;
        for(i = 0; i < a.length - 1; i++) {
            min = i ;
            for(j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j; 
                }
                if (min != i) {
                    int temp = a[i];
                    a[i] = a[min];
                    a[min] = temp;
                }
            }
        }
        for (i = 0; i < a.length; i++) {
            System.out.println("a : " + a[i]);
        }
        return a;
    }
}