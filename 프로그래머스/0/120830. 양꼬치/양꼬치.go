func solution(n int, k int) int {
    
    sheep := 12000
    beverage := 2000
    
    return (sheep * n + beverage * k) - (n / 10) * 2000 
}