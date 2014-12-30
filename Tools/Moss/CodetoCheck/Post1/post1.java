
import java.util.*;

public class post1 {

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
    if(z==1)
    {
        return x;
    }
    int b[]=new int[z/2]; int c[]=new int[z-z/2];       
    int i,j,k;
    for(int p=0;p<z/2; p++)
    {
        b[p]= x[p];
        c[p]= x[p+z/2];
    }       
    c[z-z/2-1]= x[z-1];
    b= mergesort(b,z/2);
    c= mergesort(c,z-z/2);

    for(i=0,j=0,k=0; k<z; k++)
    {
        if(b[i]<=c[j])
        {
            x[k]=b[i];
            i++;
        }
        else if( b[i]>c[j])
        {
            x[k]=c[j];
            j++;
        }
        else if(i== z/2)
        {
            x[k]= c[j];
            j++;
        }
        else if(j == z-z/2)
        {
            x[k]= b[i];
            i++;
        }
    }
    return x;
}
}
