
public class a41 {

	int[] meth(int[] list)
	{
	boolean swap = true;
	while(swap){
	   swap = false;
	   for(int i = 0;i<list.length-1;i++)
{
	        if(list[i] > list[i+1]){
	            int temp = list[i];
	            list[i] = list[i+1];
	            list[i+1] = temp;                   
	            swap = true;
	        }
	    }
	}
	return list;
	}
}
