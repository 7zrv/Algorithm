class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;
        
        while(n >= a){
            remain = n % a;
            n = (n / a) * b + remain;
            answer += n - remain;
            
            System.out.println(n);
            System.out.println(answer);
        }
        
        return answer;
    }
}