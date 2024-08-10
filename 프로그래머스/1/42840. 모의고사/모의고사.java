import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] record = {0, 0, 0};
        
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == first[i % first.length]){
                record[0]++;
            }
            if(answers[i] == second[i % second.length]){
                record[1]++;
            }
            if(answers[i] == third[i % third.length]){
                record[2]++;
            }
        }
        
        int max_score = Integer.MIN_VALUE;
        
        for(int i : record){
            max_score = Math.max(i, max_score);
        }
        
        List<Integer> ans = new ArrayList<Integer>();
        
        for(int i = 0; i < record.length; i++){
            if(record[i] == max_score){
                ans.add(i+1);
            }
        }
        
        int[] answer = new int[ans.size()];
        
        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        
        return answer;
    }
}