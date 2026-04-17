public class Search_Insert_Position {
    public int searchInsert(int[] nums, int target)
     {
        int low =0;
        int high=nums.length-1;
        int mid =(low+high)/2;
        while(low<=high){

         mid= (low+high)/2;

            if(target==nums[mid]){
                return mid;
            }
            if(target<nums[mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
}
}
