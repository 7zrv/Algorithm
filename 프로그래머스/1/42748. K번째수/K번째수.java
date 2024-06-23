import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int cnt = 0;
        
        for(int[] command : commands){
            int i = command[0] - 1;
            int j = command[1];
            int k = command[2] - 1;
            
            int[] slide = Arrays.copyOfRange(array, i, j);
            Arrays.sort(slide);
            answer[cnt] = slide[k];
            cnt++;
        }
        return answer;
    }
}