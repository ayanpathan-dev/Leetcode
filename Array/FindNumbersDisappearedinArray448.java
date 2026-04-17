import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindNumbersDisappearedinArray448 {
     public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num :nums){
            map.put(num, 1);
        }
      
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i)){
           list.add(i);
            }
        }
        
        return list;
    }
}
