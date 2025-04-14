func solution(x int, n int) []int64 {
    answer := make([]int64, n)
    for i := 0; i < n; i++ {
        answer[i] = int64(x) * int64(i+1)
    }
    return answer
}
