func solution(arr []int) []int {
    if len(arr) == 1 {
        return []int{-1}
    }

    min := arr[0]
    for _, v := range arr {
        if v < min {
            min = v
        }
    }

    result := []int{}
    removed := false
    for _, v := range arr {
        if v == min && !removed {
            removed = true
            continue
        }
        result = append(result, v)
    }

    return result
}
