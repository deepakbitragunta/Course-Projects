import java.util.ArrayList;


public class Q34 {
	
	public static ArrayList merge(ArrayList <Comparable> a, int first, int mid, int last){
	    ArrayList <Comparable> b = new ArrayList();
	    for(int k = first; k <= last; k++){
	        b.add(a.get(k));
	    }

	    System.out.println("b now contains " + b);
	    int middle =b.size() /2;
	    for(int i = first; i <= last; i++){
	        //System.out.println("mid: " + b.size() /2);
	        //System.out.println("b: " + b);
	        //System.out.println("a: " + a);
	        //System.out.println("i: " + i);
	        if(middle == b.size()){
	            a.set(i, b.remove(0));
	            middle--;
	        }else if(middle == 0){
	            a.set(0, b.remove(0));
	        }else if(b.get(0).compareTo(b.get(middle)) < 0){
	            System.out.println("moving " + b.get(0) + " from b[0] to a[" + 
	                i + "] because " + b.get(0) + " is less than " + b.get(middle));
	            a.set(i, b.remove(0));
	            middle--;
	            System.out.println("b now contains " + b);
	        }else{
	            System.out.println("moving " + b.get(middle) + " from b[" + 
	                b.size() /2 + "] to a[" + i + "] because " + b.get(0) + 
	                    " is greater than " + b.get(middle));
	            a.set(i, b.remove(middle));
	            //middle--;
	            System.out.println("b now contains " + b);
	        }
	    }

	    System.out.println();
	    System.out.println("Merge");
	    System.out.println(a);
	    System.out.println();
	    return a;
	}
	public static ArrayList mergeSort(ArrayList <Comparable> a, int first, int last){
		 ArrayList<Comparable> b = new ArrayList<Comparable>();
	    if(first < last){
	        int mid = first + (last - first) /2;
	        System.out.println("mergeSorting " + a.subList(first, last + 1));
	        mergeSort(a, first, mid);
	        System.out.println("mergeSorting " + a.subList(first, mid + 1));
	        mergeSort(a, mid + 1, last);
	        System.out.println("merging " + a.subList(first, mid + 1) + 
	            " and " + a.subList(mid + 1, last + 1));
	     b =  merge(a, first, mid, last);
	    }
	   return b;
	}
}
