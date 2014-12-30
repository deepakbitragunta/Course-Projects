
public class a77 {
	
	public static int[] sort(int numberSort[]) {
		for (int i = 1; i < numberSort.length; i++) {
            int temp = numberSort[i];
            int j = i - 1;
            while ((j >= 0) && (numberSort[j] > temp)) {
                numberSort[j + 1] = numberSort[j];
                j = j - 1;
            }
            numberSort[j + 1] = temp;
        }
        for (int i = 0; i < numberSort.length; i++) {
            System.out.println(numberSort[i]);
        }
        return numberSort;
	}

}
