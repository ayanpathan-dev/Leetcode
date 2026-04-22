package String;

public class RotateString796 {
    public boolean rotateString(String s, String goal) {
        // char[] arr = s.toCharArray();
        // for(int j =0;j<arr.length;j++){
           
        // char temp =arr[0];
        // for(int i =0;i<s.length()-1;i++){
        //      if(new String(arr).equals(goal)){
        //         return true;
        //     }
        //     arr[i] =arr[i+1];
        // }
        // arr[arr.length-1] =temp;
        // }
        
        // return false;



         if(s.length()==goal.length() && (s+s).contains(goal)){
            return true;
        }
        return false;
       
    }
}
