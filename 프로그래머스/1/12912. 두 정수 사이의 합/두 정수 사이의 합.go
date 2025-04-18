func solution(a int, b int) int64 {
    start, end := a, b
    if a > b {
        start, end = b, a
    }
    n := int64(end - start + 1)
    return n * (int64(start) + int64(end)) / 2
}
