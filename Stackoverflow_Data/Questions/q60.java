public class q60 {

    public static void main(String[] args) {

        int [] array = {12,7,3,9,4,8,0,13};
        int [] return_array = selectionSort(array);

        for (int k = 0; k < return_array.length-1 ; k++) {
            System.out.println(return_array[k] + " ");

        }


    }

    public static int[] selectionSort(int[] param){

        int min, i, j, temp;

        for (i = 0; i < param.length-4 ; i++) {
            min = i;
            for (j = i +1; j < param.length ; j++) {
                if (param[j]<param[i])
                    min = j;

            }
            if (min != i){
                temp = param[i];
                param[i] = param[j];
                param[j] = temp;
            }

        }
        return param;
    }
}