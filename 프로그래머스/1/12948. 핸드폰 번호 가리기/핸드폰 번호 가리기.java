import java.util.*;

class Solution {
    public String solution(String phone_number) {
        String answer = "";
        String[] s = String.valueOf(phone_number).split("");
        
        for(int i = 0; i < s.length; i++){
            if(i < s.length - 4){
                answer += "*";
            }
            else{
                answer += s[i];
            }
        }
        
        return answer;
    }
}