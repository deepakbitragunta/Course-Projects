
public class A40 {


		public static void main(String[] args) {

		    int x[] = { 9, 5, 8, 4, 3, 0, 6, 7, 2, 1 };
		    int[] result = InsertionSortMethod(x);

		    for (int z = 0; z < x.length; z++) {
		        System.out.print(x[z] + " ");
		    }
		}

		public static int[] InsertionSortMethod(int x[]){
		    for (int a = 0; a < x.length; a++) {
		        int divider = a;
		        if(divider > 0 & divider < x.length){
		            if(x[divider] < x[0]){
		                int temp = x[divider];
		                for(int c = divider; c > 0; c--){
		                    x[c] = x[c-1];
		                }
		                x[0] = temp;
		            }
		            if(x[divider] > x[divider-1]){
		                x[divider] = x[divider];
		            }
		            else{
		            	for(int b = divider-1; b > 0; b--){
		            	    if(x[divider] < x[b]){
		            	        int temp = x[divider];
		            	        x[divider] = x[b];
		            	        x[b] = temp;
		            	    }
		            	}
		            }
		        }
		    }
		    return x;
		}
}
