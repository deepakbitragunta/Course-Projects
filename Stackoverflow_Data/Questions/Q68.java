
public class Q68 {
	public  String[] insertionSort(String[] data){
	    for (int i=1; i<data.length; i++){
	        String item = data[i];
	        int move = binarySearch(data, item, 0, i - 1);
	        for (int j = i; j < move; j++){
	            data[j] = data[j-1];
	        }
	        data[move]= item;
	    }
	    return data;
	}

	public int binarySearch(String[] data, String item, int low, int high) {
	    int mid;
	    while(low<=high){
	        mid=(low+high)/2;
	        if(item.compareTo(data[mid]) > 0)
	            low=mid+1;
	        else if(item.compareTo(data[mid]) < 0)
	            high=mid-1;
	        else
	            return mid;
	    }
	    return low;
	}
}
