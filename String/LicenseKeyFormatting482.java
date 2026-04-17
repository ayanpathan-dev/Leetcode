import java.util.Scanner;

public class LicenseKeyFormatting482 {
     public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String =");
        String word =sc.next();
        System.out.println(licenseKeyFormatting(word));
        sc.close();
    }
    
        
       public String licenseKeyFormatting(String s, int k) {
        StringBuilder str = new StringBuilder();
        int cnt=0;
        for(int i =0 ;i<s.length();i++){
            if(s.charAt(i)!='-'){
                str.append(s.charAt(i).toUppercase);
                cnt++;
            }
        }
                StringBuilder str2 = new StringBuilder();

        string rev = str.reverse().toString();
        int j=k;
        for(int i =0;i<cnt;i++){
            if(i==j){
                str2.append('-');
                j=K+j;
            }else{
               str2.append(i);
            }
        }
        return str2.reversse().toString();
        }
        
    }

