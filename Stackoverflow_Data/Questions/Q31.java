
public class Q31 {

	 public static String quicksort(String y){
		    String x = "";
		    char[] a = new char[y.length()];
		    int i = 0;
		    int j = a.length;
		    if(j-i < 0) return y;
		    int m = i+(j-i)/2;
		    char b = a[m];
		    a[m] = a[i];
		    a[i] = b;
		    int r = i+1;
		    for(int s = r; s!=j; s=s+1){
		        if(a[s] < b)
		        {
		            char tmp = a[s];
		            a[s] = a[r];
		            a[r] = tmp;
		            r=r+1;
		        }
		    }
		    r=r-1;
		    a[i] = a[r];
		    a[r] = b;
		    return x = quicksort(y);
		}
}
