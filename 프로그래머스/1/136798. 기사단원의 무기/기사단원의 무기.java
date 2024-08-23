class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 1;
        int[] weight = new int[number+1];
        
        for(int i = 2; i <= number; i++){
            int count = countDivNum(i);
            
            if(count > limit){
                weight[i-1] = power;
            } else{
                weight[i-1] = count;
            }
        }
        
        for(int i = 0; i < weight.length; i++){
            System.out.println(weight[i]);
            answer += weight[i];
        }
        
        return answer;
    }
    
    public int countDivNum(int number){
        
        int count = 2;
        
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                count++;
            }
        }
        
        return count;
    }
}