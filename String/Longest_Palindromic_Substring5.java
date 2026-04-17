package String;
public class Longest_Palindromic_Substring5 {
   public String longestPalindrome(String s) {
        String lps ="";
        if(s.length()!=1){
      
      for(int i= 1;i<s.length();i++){
        //for odd numbers;
       int low=i;
        int high=i;

        while(s.charAt(low)==s.charAt(high)){
            low--;
            high++;

            if(low==-1 || high==s.length()){
                break;
            }
        }
        String palindrome =s.substring(low+1,high);
        if(palindrome.length()>lps.length()){
            lps=palindrome;
        }

        low=i-1;
        high=i;

        while(s.charAt(low)==s.charAt(high)){
            low--;
            high++;

            if(low==-1 || high==s.length()){
                break;
            }
        }
         palindrome =s.substring(low+1,high);
        if(palindrome.length()>lps.length()){
            lps=palindrome;
        }
      }
      }else{
        lps =s;
      }

      return lps;
}
}

