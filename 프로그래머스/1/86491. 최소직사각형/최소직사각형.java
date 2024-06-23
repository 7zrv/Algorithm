class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max_w = 0;
        int max_h = 0;
        
        
        for(int[] i : sizes){
            if(i[0] < i[1]){
                if(max_w < i[1]){
                    max_w = i[1];
                }
                
                if(max_h < i[0]){
                    max_h = i[0];
                }
            }else{
                if(max_w < i[0]){
                    max_w = i[0];
                }
                
                if(max_h < i[1]){
                    max_h = i[1];
                }
            }
        }
        
        answer = max_w * max_h;
        
        return answer;
    }
}