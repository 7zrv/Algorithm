def solution(a, b, n):
    answer = 0
    cur = 0
    
    while n >= a:
        
        answer += (n // a) * b
        cur = (n // a) * b
        n = n - (n // a) * a + cur 
        
    return answer