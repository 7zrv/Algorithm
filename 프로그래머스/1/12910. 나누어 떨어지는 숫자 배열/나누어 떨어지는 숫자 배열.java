import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(n -> n % divisor == 0).toArray();
        Arrays.sort(answer);
        
        if(answer.length > 0){
            return answer;
        }
        else{
            return new int[] {-1};
        }
        
    }
}