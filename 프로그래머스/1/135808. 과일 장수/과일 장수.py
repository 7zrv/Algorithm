def solution(k, m, score):
    answer = 0
    score.sort(reverse=True)
    count = 0
    
    while count <= len(score) - m :
        arr = []
        
        for i in range(m):
            arr.append(score[count + i])
        
        count += m
        answer += min(arr) * m
        
        
            
    return answer