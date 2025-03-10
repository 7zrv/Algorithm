func solution(num_list []int) []int {
    
    answer := make([]int, 2)
    
    for _, x := range num_list{
        if x % 2 == 0{
            answer[0]++  
        } else{
            answer[1]++
        }
    }
    return answer
}