import java.util.*;

class Solution {
    public long solution(long n) {
        String[] list = String.valueOf(n).split("");
        String s = "";
        
        Arrays.sort(list);
        
        for(int i = list.length - 1; i > -1; i--){
            s = s + list[i];
        }
        
        
        return Long.parseLong(s);
    }
}