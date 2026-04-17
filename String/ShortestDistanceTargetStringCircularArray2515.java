package String;

public class ShortestDistanceTargetStringCircularArray2515 {
    
   class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int result =Integer.MAX_VALUE;
       
        for(int n =0; n <words.length;n++){
            if(words[n].equals(target)){
                int standardDist = Math.abs(n - startIndex);
                int circularDist =  words.length - standardDist;
                result =Math.min(result, Math.min(standardDist, circularDist));
            }
        }

        return result == Integer.MAX_VALUE ? -1 :result;
        
    }
}
}
 
