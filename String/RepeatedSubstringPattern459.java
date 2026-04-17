package String;

public class RepeatedSubstringPattern459 {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder str = new StringBuilder();
        str.append(s.charAt(0));
        for(int i =1;i<s.length();i++){
          if(str.charAt(0)==s.charAt(i)){
            break;
          }
          str.append(s.charAt(i));
        }
        String part = str.toString();
    
        for(int i =0;i<s.length();i++){
            
        }
        return true;
    }
       
}
