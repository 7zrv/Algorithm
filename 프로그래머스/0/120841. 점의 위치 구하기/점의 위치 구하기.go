func solution(dot []int) int {
    
    if dot[0] > 0 && dot[1] > 0{
        return 1
    } else if dot[0] < 0 && dot[1] > 0 {
        return 2
    } else if dot[0] < 0 && dot[1] < 0 {
        return 3
    }
    return 4
}