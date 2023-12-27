def solution(babbling):
    answer = 0
    
    words = ['aya', 'ye', 'woo','ma']
    
    for i in babbling:
        for j in words:
            
            if j * 2 not in i:
                i = i.replace(j, " ")
        
            if not i.strip():
                
                answer += 1
                break
                
    return answer