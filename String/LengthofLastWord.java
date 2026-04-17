package String;

public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
       int cnt=0;
        for(int i =str.length();i>0;i++){
            if(str.charAt(i)==' '){
              break;
            }
            cnt++;
        }
        return cnt;
    }
}
