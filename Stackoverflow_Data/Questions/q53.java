import java.util.ArrayList;


public class q53 {
	public Object[] sort(ArrayList<Integer> finalarray)
    {   
        
        ArrayList<Integer> right = new ArrayList<>();
        ArrayList<Integer> left = new ArrayList<>();
        int  mid = finalarray.size()/2;
        for(int i=0;i<mid;i++) left.add(finalarray.get(i));
        for(int j=mid;j<finalarray.size();j++) right.add(finalarray.get(j));


        sort(left);
        sort(right);
        int l=0, r=0 , m =0;
        while(l< left.size() && r< right.size())
        {

              if(left.get(l)> right.get(r))
              {
                  finalarray.set(m, right.get(r));
                  r++;
              }
              else
              {
                  finalarray.set(m, left.get(l));
                  l++;
              }
              m++;
        }
        while(l< left.size())
        {
             finalarray.set(m, left.get(l));
             l++;
             m++;

        }
         while(r< right.size())
        {
             finalarray.set(m, right.get(r));
             r++;
             m++;

        }

         return finalarray.toArray();
    }

}

