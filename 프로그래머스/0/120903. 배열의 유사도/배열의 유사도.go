func solution(s1 []string, s2 []string) int {
    
    answer := 0
    
    for _, firstWord := range s1{
        for _, secondWord := range s2{
            if firstWord == secondWord{
               answer++ 
            } 
        }
    }
    return answer
}