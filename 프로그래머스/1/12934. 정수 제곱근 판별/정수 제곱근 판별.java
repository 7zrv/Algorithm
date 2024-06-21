class Solution {
    public long solution(long n) {
        long answer = 0;
        double route = Math.sqrt(n);
        
        if(route % 1 == 0){
            return (long) ((route + 1) * (route + 1));
        }
        else{
            return -1;
        }
        
    }
}