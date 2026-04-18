
public class PrimeInDiagonal2614 {
    public int diagonalPrime(int[][] nums) {
        int max =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i][i]>1){
        boolean status = true;
                for(int j=2;j*j<=nums[i][i];j++){
                    if(nums[i][i]%j==0){
                        status = false;
                        break;
                    }
                }
                if(status){
                    max =Math.max(max,nums[i][i]);
                   }
            }
            if(nums[i][nums.length-1-i]>1){
        boolean status = true;
                for(int j=2;j*j<=nums[i][nums.length-1-i];j++){
                    if(nums[i][nums.length-1-i]%j==0){
                        status = false;
                        break;
                    }
                }
                if(status){
                    max=Math.max(max, nums[i][nums.length-1-i]);
                   }
            }
        }
        return max;
    }
}
