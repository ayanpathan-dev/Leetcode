package String;

import java.util.Scanner;

public class DetectCapital520{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number =");
        String word =sc.next();
        System.out.println(detectCapitalUse(word));
        sc.close();
    }
    
        
       public static boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(word.substring(1).equals(word.substring(1).toLowerCase())
        && Character.toUpperCase(word.charAt(0))==word.charAt(0))
        { 
            return true;

        }
       return false;
    }

    }
