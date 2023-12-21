def solution(k, score):
    answer = []
    result = []
    
    for  i in range(len(score)):
        
        if len(answer) < k:
            answer.append(score[i])
            result.append(min(answer))
        else:
            if score[i] > min(answer):
                del answer[answer.index(min(answer))]
                answer.append(score[i])
                result.append(min(answer))
            else:
                result.append(min(answer))
            
    
    
    return result