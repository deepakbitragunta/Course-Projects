import java.util.ArrayList;
import java.util.Arrays;

public class A5 {
	public static int[] sort(int[] input, int length){
	    ArrayList<Integer>[]bin=(ArrayList<Integer>[]) new ArrayList[10];
	    int size = length;
	    for(int i = 0;i<length;i++){
	        bin[i] = new ArrayList<Integer>();
	    }

	    int power = 10;
	    for(int i = 0;i<size+1;i++){
	        for(int v = 0;v<input.length;v++){
	            int d = input[v] % power;
	            if(power>10)
	                d = d/ (power/10);
	            bin[d].add(input[v]);
	        }
	        for(int j = 0;j<10;j++){
	            while(!bin[j].isEmpty()){
	                int temp = bin[j].get(0);
	                bin[j].remove(0);
	                input[j] = temp;
	            }
	        }
	        power = power*10;

	    }
	    System.out.println("Final result");
	    System.out.println(Arrays.toString(input));
	    return input;
	}
	}

	
