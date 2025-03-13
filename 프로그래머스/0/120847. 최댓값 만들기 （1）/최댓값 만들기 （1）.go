import "sort"

func solution(numbers []int) int {
    sort.Ints(numbers) 
    
    n := len(numbers)
    
    return max(numbers[n-1]*numbers[n-2], numbers[0]*numbers[1])
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}
