package String;

import java.util.Arrays;

public class ScoreOfString3110 {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            sum =sum + Math.abs(s.charAt(i)-s.charAt(i+1));
    }
    
    return sum;
}

public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        int cnt=0;
        for(int i =0;i<nums.length;i++){
            ans[cnt]=nums[i];
            cnt++;
        }
        for(int i =0;i<nums.length;i++){
            ans[cnt]=nums[i];
            cnt++;
        }
        return ans;
    }
}