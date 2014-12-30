public class A74
{
  public static void main(String a[])
  {
      int i;
      int array[] = {90, 8, 7, 56, 123, 235, 9, 1, 653};

      System.out.println("Values Before the sort:\n");

      for(i = 0; i < array.length; i++)
          System.out.print( array[i]+"  ");
          System.out.println();
          bubble_srt(array, array.length);
          System.out.print("Values after the sort:\n");
      for(i = 0; i <array.length; i++)
      System.out.print(array[i]+"  ");
      System.out.println();
      System.out.println("PAUSE");
  }

  public static void bubble_srt( int a[], int n )
  {
      int i, j,t=0;
          for(i = 0; i < n; i++)
              {
                for(j = 1; j < (n-i); j++)
                  {
                      if(a[j-1] > a[j])
                          {
                              t = a[j-1];
                              a[j-1]=a[j];
                              a[j]=t;
                          }

                  }
              }
  }
}