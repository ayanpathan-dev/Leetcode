
public class TwoFurthestHouseWithDifferentColors2078 {
    public int maxDistance1(int[] colors) {
        int max = 0;
        for(int i =0;i<colors.length;i++){
       
            for(int j=colors.length-1 ;i<j;j--){
  
                if(colors[i]!=colors[j]){
                    System.out.println(j +""+max);
                   max =Math.max(max, j-i);
                   break;
                }

            }
        }
       return max;
    }

public int maxDistance(int[] colors) {
        int n =colors.length;
        int left =0;
        int right =n-1;

 
        while(colors[left]==colors[n-1]){
            left++;
        }
        while(colors[right]==colors[0]){
            right--;
        }


       return Math.max(n-1-left, right);
    }


}
