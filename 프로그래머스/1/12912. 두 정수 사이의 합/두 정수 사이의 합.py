def solution(a, b):
    answer = 0
    bigger = max(a, b)
    smaller = min (a, b)
    
    for i in range(smaller, bigger+1):
        answer += i
        
    return answer