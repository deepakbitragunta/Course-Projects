import java.util.Random;


public class Q2
{
    //private static int[] myarray=new int[20];
    private static int[] array;
    public static void main(String[] args)
    {
       array=new int[20];
        fillArrayRandom(array);

        sortAscending(array);

        ///This is the bit that does not do what it is meant to do!
        for(int i=0;i<array.length;i++)
        {
           // System.out.printf("Testing %d%n",myarray[i]);
        }

    }
    public static void fillArrayRandom(int[] array)
    {
        int i;
        for(i=0;i<array.length;i++)
        {
            array[i]=getRandomNum();
        }
    }

    public static int getRandomNum()
    {
        Random num=new Random();
        int TestNumber=num.nextInt(2000);
        return TestNumber;
    }

    public static int[] sortAscending(int[] array)
    {
        int smallest;


        for(int i=0;i<array.length-1;i++)
        {
            smallest=i;

            for(int index=i+1;index<array.length;index++)
            {
                if(array[index]<array[smallest])
                    smallest =index;


               swap(i,smallest);
            }

            System.out.printf("%d%n",array[i]);

        }
        return array;

    }

    public static void swap(int first,int second)
    {
        int temporary=array[first];
        array[first]=array[second];
        array[second]=temporary;
}
}
