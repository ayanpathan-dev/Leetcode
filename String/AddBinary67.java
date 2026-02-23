package String;

public class AddBinary67 {
    public String addBinary(String a, String b) {
        if(a.length()==b.length()){
        if(a.charAt(0)=='0'&&b.charAt(0)=='0'){
            return "0";
        }
    }
        int rem2=0;
        int power=0;

        for(int i=a.length()-1;i>=0;i++){
            int digit= a.charAt(i)+'0';
            rem2 = rem2+digit * (int)Math.pow(2,power++);
        }
      int rem=0;
       power=0;
        for(int i=b.length()-1;i>=0;i++){
            int digit= b.charAt(i)+'0';
            rem = rem+digit* (int)Math.pow(2,power++);
        }
          int result = rem +rem2;
   StringBuilder sb = new StringBuilder();
          while(result>0){
            int digit =result%2;
            result=result/2;
            sb.append(digit);
          }
          
        return sb.reverse().toString();
    }
}
