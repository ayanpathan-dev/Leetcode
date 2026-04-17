public class Stock_121{
    public int maxProfit(int[] nums){
        int min = nums[0];
    
        int profit =0;
        for(int i =1;i<nums.length;i++)
        {
          int tprofit =nums[i]-min;

          if(profit<tprofit){
            profit= tprofit;
          }
          if(min>nums[i]){
            min= nums[i];
          }

        }
        return profit;
    }
}
