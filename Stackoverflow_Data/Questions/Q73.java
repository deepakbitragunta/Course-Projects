
public class Q73 {
	static int[] bubbleSort() {
        int [] a = {1,3,4,2,5};
        int [] b = new int[a.length];
        int j = 0;

        for(int c = 0;c <= a.length;c++){//this loop doesnt even do anything??? 
            for(int i = 0;i<a.length-j;i++){

                if(a[i]>a[i+1]){
                    b[i] = a[i+1];
                    b[i+1] = a[i];
                    j++;
                }
                else{
                    b[i] = a[i];
                    b[i+1] = a[i+1];
                    j++;
                }
            }
        }

        for(int i = 0; i< b.length ; i++)
            System.out.println(b[i]);
    return b;
	}
	public static void main(String[] args){
		System.out.println(bubbleSort());
	}
}
