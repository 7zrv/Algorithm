func solution(slice int, n int) int {
    
    count := 0
    
    for slice * count <= n {
        count++
        if slice * count >= n {
            return count
        }
    }
    return count
}