
public class a83 {

	public static int[] selectionSort(int[] param){

        int min, i, j, temp;    
        for (i = 0; i < param.length-1 ; i++) {
            min = i;
            for (j = i +1; j < param.length ; j++) {
                if (param[j]<param[min])
                    min = j;

            }
            if (min != i){
               temp = param[i];
               param[i] = param[min];
               param[min] = temp;
            }

       }
       return param;
    }
}
