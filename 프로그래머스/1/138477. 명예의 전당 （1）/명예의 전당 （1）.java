import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> honor = new ArrayList<>();
        
        
        for(int i : score){
            
            honor.add(i);
            Collections.sort(honor);
            
            if(honor.size() > k){
                honor.remove(0);
            }
            
            result.add(honor.get(0));
        }
        
        int[] answer = result.stream().mapToInt(Integer::intValue).toArray();        
        return answer;
    }
}