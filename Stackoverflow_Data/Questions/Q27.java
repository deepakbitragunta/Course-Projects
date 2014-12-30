
	import java.awt.event.*;
	import javax.swing.*;
	import java.util.ArrayList;
	import java.util.Arrays;


	public class Q27 {

	private int[] railgun = {2,7,4,2,4,7,1};


	public Q27() {
	 //   System.out.println(Arrays.toString(railgun));
	//    SelectionSort(railgun);
	 //   System.out.println(Arrays.toString(railgun));
	}


	public static int[] SelectionSort(int[] ray){

	    for(int j = 0; j < ray.length; j++){

	    int low = 0;
	    for(int i = j; i < ray.length + 1;i++){
	        if(ray[i] < ray[low])
	            low = i;
	    }
	    System.out.println(ray[low]);
	    int temp = ray[low];
	    ray[low] = ray[j];
	    ray[j] = temp;
	}
	   return ray; 	
	}


	public static void main(String[] args) {
	   Q27 steve = new Q27();
	}
	
}
