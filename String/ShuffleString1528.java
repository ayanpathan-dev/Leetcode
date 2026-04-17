package String;

import java.util.Arrays;

public class ShuffleString1528 {
    public String restoreString(String s, int[] indices) {
        char arr[] = new char[indices.length];

        for(int i=0;i<indices.length;i++){
            arr[indices[i]] = s.charAt(i);
        }

        return new String(arr);
    }
}
