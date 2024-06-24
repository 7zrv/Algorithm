import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        HashMap<Character,Integer> dic = new HashMap<>();
        
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            answer[i] = i-dic.getOrDefault(ch,i+1);
            dic.put(ch,i);
        }
        return answer;
    }
}
