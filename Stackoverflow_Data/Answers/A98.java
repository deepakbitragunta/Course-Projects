
public class A98 {
	public static int[] Sorting(int[] sort, int a, int con){
		
		int j, count=0;
		for(j=1; j<=con; j++){
		  if(sort[a]==sort[j])
		   count++;
		}System.out.println(sort[a]+" occurs "+count+" times"); 
		Sorting(sort, a-1, con);
		return sort;
}
}
