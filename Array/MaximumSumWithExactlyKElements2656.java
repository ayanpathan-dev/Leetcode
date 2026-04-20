import java.util.Arrays;

public class MaximumSumWithExactlyKElements2656 {
   class Solution {
   public int maximizeSum(int[] nums, int k) {
        int n =nums.length-1;
        int sum =0;
        Arrays.sort(nums); 
        for(int i =0;i<k;i++){
            sum+=nums[n];
            nums[n]+=1;
        }
        
        return sum;
    }
}
}
