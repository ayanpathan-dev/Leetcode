package String;

public class ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        
            StringBuilder sb = new StringBuilder();
        for(char ch : s.trim().toLowerCase().toCharArray()){
            if(Character.isLetterOrDigit(ch)){
             sb.append(ch);
             
            }
        }
        String str=sb.toString(); 
        String rev=sb.reverse().toString();
       if(str.equals(rev)){
        return true;
       }else{
        return false;
       }

    }
}
