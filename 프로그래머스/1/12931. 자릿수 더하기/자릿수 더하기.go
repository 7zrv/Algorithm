func solution(n int) int {
    answer := 0

    for n > 0 {
        answer += n % 10
        n = n / 10
    }

    return answer
}