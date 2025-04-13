func solution(arr []int) float64 {
    if len(arr) == 0 {
        return 0
    }

    sum := 0
    for _, num := range arr {
        sum += num
    }

    return float64(sum) / float64(len(arr))
}
