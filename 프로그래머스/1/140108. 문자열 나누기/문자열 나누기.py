def solution(s):
    answer = 0
    
    count_x = 0
    count_y = 0
        
    for spel in s:
        
        if count_x == count_y:
            answer += 1
            x = spel
            count_x, count_y = 0, 0
        
        if spel == x:
            count_x += 1
        else:
            count_y += 1
            
            
        
    
    
    return answer