class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = -1;
        StringBuilder s = new StringBuilder();
        
        while(n >= 1){
            s.append(n % 3);
            n /= 3;
        }
        
        for(int i =  s.length() - 1; i > -1; i--){
            answer += ((int) (s.charAt(i) - '0')) * Math.pow(3, ++cnt);
        }
        
        return answer;
    }
}