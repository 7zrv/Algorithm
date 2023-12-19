def solution(t, p):
    answer = 0
    
    for i in range(0, len(t)-len(p)+1):
        
        sliced = ""
        
        for j in range(i, i+len(p)):
            sliced += t[j]
            
        if sliced <= p:
            answer += 1
        
    return answer