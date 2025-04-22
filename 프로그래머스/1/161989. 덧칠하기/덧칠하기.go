func solution(n int, m int, section []int) int {
    count := 0
    paintedUntil := 0

    for _, s := range section {
        if s > paintedUntil {
            paintedUntil = s + m - 1
            count++
        }
    }

    return count
}
