func solution(sides []int) int {
    
    temp := 0
    max := -1
    
    for _, x := range sides{
        temp += x
        if x > max {
            max = x
        }
    } 
    
    if temp - max > max{
        return 1
    }
    return 2
}