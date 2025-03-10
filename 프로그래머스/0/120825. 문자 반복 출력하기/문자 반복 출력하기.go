func solution(my_string string, n int) string {
    
    answer := ""
    
    for _, x := range my_string{
        for y := 0; y < n; y++{
            answer += string(x)
        }
    }
    return answer
}