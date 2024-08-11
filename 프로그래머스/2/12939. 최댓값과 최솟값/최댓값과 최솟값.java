import java.util.*;

class Solution {
    public String solution(String s) {
        String[] nums = s.split(" ");
        String answer = "";
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(String num : nums){
            if(Integer.parseInt(num) > max){
                max = Integer.parseInt(num);
            }
            if(Integer.parseInt(num) < min){
                min = Integer.parseInt(num);
            }
            
        }
        
        answer = answer + min + " " + max;
        
        return answer;
    }
}