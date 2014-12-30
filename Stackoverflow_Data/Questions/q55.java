import java.util.ArrayList;
import java.util.List;

public class q55 {

   public static Object[] sorter(int[] numbers)
   {
	   List<Integer> l = new ArrayList<Integer>();
	   for (int t:numbers)
		   l.add(t);
	   l=msort(l);
	   return l.toArray();
   }

    public static List<Integer> msort(List<Integer> l) {     
        if (l.size() <= 1) {
            return l;
        }

        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        for (int i = 0; i < (l.size() / 2); i++) {
            left.add(l.get(i));
        }
        for (int i = l.size() / 2; i < l.size(); i++) {
            right.add(l.get(i));
        }

        msort(left);
        msort(right);
        //System.out.println(left + "" +right);

        return join(left,right);
    }

    public static List<Integer> join(List<Integer> left, List<Integer> right) { 
        /*if (right.size() == 0) {
            return left;
        }
        if (left.size() == 0) {
            return right;
        }*/

        List<Integer> fin = new ArrayList<Integer>();
        // pointers
        int lp = 0, rp = 0, fp = 0;

        while (lp < left.size() && rp < right.size()) { 
            if (left.get(lp) < right.get(rp)) {
                fin.add(left.get(lp));  
                lp++;
            } else {
                fin.add(right.get(rp));  
                rp++;        
            }
            fp++;
        }   
        return fin;
    }       
}