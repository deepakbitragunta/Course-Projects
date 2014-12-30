
public class Q37 {
	
	public static int[] insertionSort(int input[]) {
		int i, j, key;
		
		 for(j = 1; j < input.length; j++){
	            key = input[j];
	            for(i = j-1; i >= 0; i--){ // Look for a proper place for the key
	                if(i-1 < 0){
	                    if(input[i] > key){ // Have you found that place ?
	                        for(int k = j;k > i; k--){ // Begin shifting
	                            input[k] = input[k-1];
	                        } // Done Shifting
	                        input[i] = key; // Insert the key in proper place
	                        break;
	                    }
	                }else{
	                    if(input[i] > key && input[i-1] < key){ // Have you found that place ?
	                        for(int k = j;k > i; k--){ // Begin shifting
	                            input[k] = input[k-1];
	                        } // Done Shifting
	                        input[i] = key; // Insert the key in proper place
	                        break;
	                    }
	                }
	            }
	        }
		 return input;
	}

    public static void main(String[] args) {
        int[] input ={5,3,5,3,2,1}; // the input to be sorted.
        int key; // the value that will be put into its place in the pass
        int j = 0; // indexes to be 
        int i = 0; // used for sorting


      input = insertionSort(input);

        for(int each : input){
            System.out.println(each);
        }
    }
}  

