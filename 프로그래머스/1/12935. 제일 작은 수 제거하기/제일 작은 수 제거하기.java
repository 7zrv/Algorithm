import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        
        int min = Arrays.stream(arr).min().getAsInt();
        int j = 0;
        
        if(arr.length < 2) {
            return new int[] {-1};
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != min){
                answer[j] = arr[i];
                j++;
            }
            
        }
        
        
        
        return answer;
    }
}