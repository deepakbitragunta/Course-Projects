
public class Q63 {
	public static int[] ExchangeSort(int[] num)
	{
	    int i,j,temp;

	    for(i=1;i<num.length-1;i++)
	    {
	        for(j=i+1;j<num.length;j++)
	        {
	            if(num[i]<num[j])
	            {
	                temp = num[i];
	                num[i] = num[j];
	                num[j] = temp;

	                //System.out.println(temp);
	            }
	        }

	    }
	    return num;
	}
}
