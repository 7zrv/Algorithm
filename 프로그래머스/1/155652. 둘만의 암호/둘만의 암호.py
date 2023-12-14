def solution(s, skip, index):
    answer = ''
    
    
    
    for spel in s:
        
        asc = ord(spel)
        
        for i in range(index):
            asc += 1
            while chr(asc) in skip:
                asc += 1
                if asc > 122:
                    asc = 97
            if asc > 122:
                asc = 97
                if chr(asc) in skip:
                    asc += 1
            result = chr(asc)
                
        
        
        
        answer += result
            
    return answer