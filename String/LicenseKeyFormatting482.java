package String;

import java.util.Scanner;

public class LicenseKeyFormatting482 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String =");
        String word =sc.next();
        System.out.println(licenseKeyFormatting("word",4));
        sc.close();
    }
    
        
       public static String licenseKeyFormatting(String s, int k) {
        
        StringBuilder str = new StringBuilder();
        int cnt=0;
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i)!='-'){
                str.append(Character.toUpperCase(s.charAt(i)));
                cnt++;
            }
        }
                StringBuilder str2 = new StringBuilder();

        String rev = str.reverse().toString();
        int j=k;
        for(int i =0;i<cnt;i++){
            if(i==j){ 
                str2.append('-');
                str2.append(rev.charAt(i));
                j=j+k;
            }else{
               str2.append(rev.charAt(i));
            }
        }
        return str2.reverse().toString();
        }
        
    }

