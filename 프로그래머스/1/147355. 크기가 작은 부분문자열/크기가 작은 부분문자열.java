class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        
        for(int i = 0; i < t.length()-p.length()+1; i++){
            String div = "";
            for(int j = i; j < i+p.length(); j++){
                div += t.charAt(j);
            }
            if( Long.parseLong(div) <= Long.parseLong(p)){
                answer += 1;
            }
        }
        return answer;
    }
}