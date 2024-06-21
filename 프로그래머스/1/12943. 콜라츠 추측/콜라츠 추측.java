class Solution {
    public int solution(int num) {
        int answer = 0;
        int cnt = 0;
        long n = (long) num;
        
        if(n == 1){
            return 0;
        }
      
        while(n != 1 && cnt < 500){
            if(n % 2 == 0){
                n /= 2;
            }
            else{
                n = (n * 3) + 1;
            }
            cnt += 1;
            
        }
        
        
        if(n == 1){
            return cnt;
        }
        else{
            return -1;
        }
        
    }
}