public class LongestContinuousIncreasingSubsequence674 {
   
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1)return 1;
        int cnt =1;
        int maxlen =0;
        
        for(int i =1;i<nums.length;i++){
          if(nums[i]>nums[i-1]){
           cnt++;
          }else{
            cnt=1;
          }
          maxlen=Math.max(cnt, maxlen);
        }
           
        return maxlen;
    }
}

