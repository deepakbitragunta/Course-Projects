import java.util.*;
public class q54 {
    public int[] threeSum(int[] num) {
        Arrays.sort(num);
        LinkedList<List<Integer>> ret = new LinkedList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1;
            int end = num.length - 1;
            while (start < end) {
                if (num[i] + num[start] + num[end] == 0) {
                    LinkedList<Integer> oneResult = new LinkedList<>();
                    oneResult.add(num[i]);
                    oneResult.add(num[start]);
                    oneResult.add(num[end]);
                    set.add(oneResult);
                    start++;
                    end--;
                } else {
                    if (num[i] + num[start] + num[end] < 0)
                        start++;
                    else
                        end--;
                }
            }
        }
        ret.addAll(set);
        return num;
    }
}