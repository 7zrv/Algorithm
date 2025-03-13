func solution(array []int, height int) int {
    answer := 0
    
    for _, x := range array {
        if x > height {
            answer++
        }
    }
    
    return answer
}