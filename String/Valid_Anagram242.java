package String;

import java.util.Arrays;

public class Valid_Anagram242 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] a1 = new char[s.length()];
    
        char[] a2 =new char[t.length()];
        a1 =s.toCharArray();
        a2 =t.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }
        return true;
    }
}
