func solution(n int64) []int {
    var result []int
    for n > 0 {
        digit := int(n % 10)
        result = append(result, digit)
        n /= 10
    }
    
    return result
}
