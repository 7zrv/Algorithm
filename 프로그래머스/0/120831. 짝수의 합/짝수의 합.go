func solution(n int) int {
    answer := 0
    
    for x := 1; x <= n; x++ {
        if x % 2 == 0{
            answer += x
        }
    }
    
    return answer
}