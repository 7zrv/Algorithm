func solution(n int) int {
    answer := n

    for i := 1; i < n / 2 + 1; i++ {
        if n % i == 0 {
            answer += i
        }
    }

    return answer
}
