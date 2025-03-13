func solution(strlist []string) []int {
    lengths := make([]int, len(strlist))

    for i, str := range strlist {
        lengths[i] = len(str)
    }
    
    return lengths
}
