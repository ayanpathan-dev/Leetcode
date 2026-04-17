import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> main = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            if (i == 1) {
                list.add(1);
                prev =list;
            } else {
                list.add(1);
                for (int j = 1; j < i-1; j++) {
                    list.add(prev.get(j-1) + prev.get(j));
                    
                }
                list.add(1);
                prev=list;
            }
            main.add(list);
        }
        return main;
    }
}