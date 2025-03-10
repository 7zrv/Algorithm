func solution(money int) []int {
    
    arr := make([]int, 2)
    
    arr[0] = money / 5500
    arr[1] = money % 5500
    return arr
}