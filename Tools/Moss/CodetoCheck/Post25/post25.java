

import java.io.*;
import java.util.Arrays;

public class post25 {

  private static int [] LeftSubArray(int [] Array)
  {
    int [] leftHalf = Arrays.copyOfRange(Array, 0, Array.length / 2);
    return leftHalf;
  }

  private static int [] RightSubArray(int [] Array)
  {
    int [] rightHalf = Arrays.copyOfRange(Array, Array.length / 2 + 1, Array.length);
    return rightHalf;
  }

  private static int [] Sort(int [] A)
  {
    if(A.length > 1)
    {
      return Merge( Sort( LeftSubArray(A) ) , Sort( RightSubArray(A) ) );
    }
    else
    {
      return A;
    }
  }

  private static int [] Merge(int [] B, int [] C)
  {
    int [] D = new int[B.length + C.length];
    int i,j,k;
    i = j = k = 0;
    while(k < D.length)
    {
      if(i == B.length)
      {
        //Copy the remainder of C into D
        while(k < D.length){ D[k++] = C[j++]; }
      }
      if(j == C.length)
      {
        //Copy the remainder of B into D
        while(k < D.length){ D[k++] = B[i++]; }
      }
      if(i<B.length && j<C.length)
      {
        if(B[i] > C[j]){ D[k++] = B[i++]; }
        else { D[k++] = C[j++]; }
      }
    }
    return D;
  }

  public static void main(String [] args)
  {
    int [] array = {1,3,5,2,4};
    int [] sorted = post25.Sort(array);
    for(int i = 0;i < sorted.length; ++i)
    {
      System.out.print(sorted[i] + " ");
    }
  }
}
