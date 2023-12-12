def solution(cards1, cards2, goal):
    
    answer = []
    
    c1_len, c2_len = len(cards1), len(cards2)
    
    c1_idx, c2_idx = 0, 0
    
    for word in goal:
        
        if c1_idx < c1_len and word == cards1[c1_idx]:
            answer.append(word)
            c1_idx += 1
            
        elif c2_idx < c2_len and word == cards2[c2_idx]:
            answer.append(word)
            c2_idx += 1
            
    if answer == goal:
        return 'Yes'
    else:
        return 'No'
        