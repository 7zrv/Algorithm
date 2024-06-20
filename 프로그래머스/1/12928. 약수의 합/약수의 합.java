class Solution {
    public int solution(int n) {
        int answer = n;
        int limit = n / 2;
        
        for(int i = 1; i <= limit; i++){
            if(n % i == 0){
                answer += i;
            }
        }
        
        return answer;
    }
}