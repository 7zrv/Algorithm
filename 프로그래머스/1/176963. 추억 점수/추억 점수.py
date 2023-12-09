def solution(name, yearning, photo):
    
    
    dic = dict(zip(name, yearning))
    answer = []
    
    for people in photo:
        
        sum = 0
        
        for person in dic:
            if person in people:
                sum += dic[person]
            
        answer.append(sum)
        
    return answer