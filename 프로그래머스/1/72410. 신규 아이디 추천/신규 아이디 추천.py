def solution(new_id):
    answer = ''
    
    new_id = new_id.lower()
    
    for i in new_id:
        if i.isalpha() or i.isdigit() or i in '-_.':
            answer += i
        
    while '..' in answer:
        answer = answer.replace('..', '.')
    
    while answer:
        
        if answer[0] != '.' and answer[-1] != '.':
            break
        
        if answer[0] == '.':
            answer = answer[1:]
        elif answer[-1] == '.':
            answer = answer[:-1]
    
    if not answer:
        answer += 'a'
        
    if len(answer) >= 16:
        answer = answer[0:15]
        
    while answer:
        
        if answer[-1] != '.':
            break
        
        if answer[-1] == '.':
            answer = answer[:-1]
        
    
    while len(answer) < 3:
        answer += answer[-1]
        
    
    
    return answer