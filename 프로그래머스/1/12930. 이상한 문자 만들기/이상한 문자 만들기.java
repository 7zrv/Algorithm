class Solution {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        String answer = "";
        
        for(String word : words){
            for(int i = 0; i < word.length(); i++){
                if(i % 2 == 0){
                    answer += Character.toUpperCase(word.charAt(i));
                }else{
                    answer += Character.toLowerCase(word.charAt(i));
                }
            }
            answer += " ";
        }
        
        answer = answer.substring(0, answer.length()-1);
        
        return answer;
    }
}