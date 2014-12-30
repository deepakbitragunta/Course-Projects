import java.util.ArrayList;


public class Q35 {
	
	public ArrayList insertionSort(ArrayList <Double>list){
	    double temp;
	    int  previousIndex;

	    for(int index = 1; index < list.size(); index++){
	        temp = list.get(index);
	        previousIndex = index - 1;
	        while((list.get(previousIndex) > temp) && (previousIndex > 0)){
	            list.set((previousIndex+1), list.get(previousIndex));
	            previousIndex-=1;
	        }
	        if(list.get(previousIndex) > temp){
	            list.set((previousIndex+1), list.get(previousIndex));
	           list.set((previousIndex+1), temp);
	        }else{
	           list.set((previousIndex+1), temp);
	        }
	    }
	    return list;
	}

}
