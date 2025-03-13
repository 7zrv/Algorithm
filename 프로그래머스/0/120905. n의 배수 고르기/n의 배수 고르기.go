func solution(n int, numlist []int) []int {
    result := make([]int, 0)

    for _, x := range numlist {
        if x % n == 0 {
            result = append(result, x)
        }
    }

    return result
}
