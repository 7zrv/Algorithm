class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = n>=m?n:m;
        int min = n>=m?m:n;
        int div = 0;
        int mul = max;
        
        for(int i = 1; i <= min; i++){
            if(max % i == 0 && min % i == 0){
                div = i;
            }
        }
        answer[0] = div;
        
        while(true){
            if(mul % min == 0){
                break;
            }
            
            mul += max;
            
        }
        
        answer[1] = mul;
        
        return answer;
    }
}