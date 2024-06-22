class Solution {
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0){
            return answer + s.charAt((int) (s.length() / 2) -1) +s.charAt((int) s.length() / 2);
        } else{
            return answer + s.charAt((int) s.length() / 2);
        }
        
    }
}