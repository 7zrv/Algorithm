func solution(numbers []int) float64 {
    
    answer := 0.0
    count := 0
    
    for _, x := range numbers {
        answer += float64(x)
        count++
    }
    
    return answer / float64(count)
}