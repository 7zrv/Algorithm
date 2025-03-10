func solution(num1 int, num2 int) int {
    
    answer := float64(num1) / float64(num2) * 1000
    
    return int(answer)
}