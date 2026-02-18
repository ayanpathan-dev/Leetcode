import java.util.HashMap;

public class MissingNumber {
    
    public int missingNumber(int[] nums) {
        int cnt=0 ;
        HashMap<Integer,Integer> map= new HashMap<>() ;
         for(int i=0 ;i<nums.length;i++){
               map.put(nums[i],1);
               cnt++;
            }

            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(i)){
                    return i;
                }
            }
             return cnt;
         }
        
    

}
