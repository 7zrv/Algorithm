import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> nums = new ArrayList<>(); 
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                nums.add(numbers[i] + numbers[j]);
            }
        }
        
        Set<Integer> set = new HashSet<>(nums);
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}