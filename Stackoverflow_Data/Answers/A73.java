
public class A73 {
	static int[] bubbleSort() {
	    int [] a = {1,3,4,2,5};
	    for(int c = 0;c < a.length;c++){//now it does 
	        for(int i = 0;i+1<a.length-c;i++){

	            if(a[i]>a[i+1]){
	                int tmp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = tmp;
	            }
	        }
	    }

	    for(int i = 0; i< a.length ; i++)
	        System.out.println(a[i]);
	    return a;
	}
	public static void main(String[] args){
		System.out.println(bubbleSort());
	}
}
