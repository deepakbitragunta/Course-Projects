
public class Q97 {
	int data[];

	public void QuickSort(int start, int end)
	{
	            if(start == end || end < start || end > data.length)
	            {
	                return;
	            }

	            //find the pivot
	            int pivotPos = (int)(start + (end - start) / 2);
	            int temp;

	            //switch the pivot to the end
	            temp = data[pivotPos];
	            data[pivotPos] = data[end];
	            data[end] = temp;

	            int LowerPoint = start;
	            int HigherPoint = end - 1;

	            //loop through and move low values down
	            //and high values up
	            while(LowerPoint != HigherPoint)
	            {
	                while(data[LowerPoint] < data[end] && LowerPoint < HigherPoint)
	                {
	                    LowerPoint++;
	                }

	                while(data[HigherPoint] > data[end]  && LowerPoint < HigherPoint)
	                {
	                    HigherPoint--;
	                }

	                if(LowerPoint != HigherPoint)
	                {
	                    temp = data[HigherPoint];
	                    data[HigherPoint] = data[LowerPoint];
	                    data[LowerPoint] = temp;
	                }
	            }

	            //one last check to make sure we don't swap the pivot with a lower value
	            //if this value is lower than increment our pointers up so we guarentee
	            //the swap with a higher value
	            if(data[LowerPoint] < data[end])
	            {
	                LowerPoint++;
	                HigherPoint++;
	            }

	            //place the pivot back to the middle of the list
	            //by swapping it with the higher point
	            temp = data[HigherPoint];
	            data[HigherPoint] = data[end];
	            data[end] = temp;

	            this.QuickSort(0, LowerPoint - 1);
	            this.QuickSort(HigherPoint + 1, end);

	        }
}
