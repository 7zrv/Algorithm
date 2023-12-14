def solution(keymap, targets):
    answer = []
    
    
    for word in targets:
        
        count = 0
        
        for spel in word:
            
            can = False
            temp = 101
            
            for key in keymap:
                if spel in key:
                    temp = min(key.index(spel)+1, temp)
                    can = True
                    
            if can == True:
                count += temp
            else:
                break
            
        if can == True:
            answer.append(count)
        else:
            answer.append(-1)
                
    return answer