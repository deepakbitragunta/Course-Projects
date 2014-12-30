import java.util.Scanner;



public class post {

    public static void main(String args[]) {
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the number of elements");
    int n= in.nextInt();
    int a[]= new int[n];
    System.out.println("Enter the contents");
    for(int i=0; i<n; i++)
    {
        a[i]=in.nextInt();
    }
    a = mergesort(a,n);
    for(int i=0; i<n; i++)
    {
        System.out.println(a[i]);
    }   
  }  
    public static int[] mergesort(int[] x, int z)
    {
		return x;
    	
    }
}