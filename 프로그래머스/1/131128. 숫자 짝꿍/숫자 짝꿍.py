def solution(X, Y):
    answer = ''
    
    count_X = [0,0,0,0,0,0,0,0,0,0]
    count_Y = [0,0,0,0,0,0,0,0,0,0]
    
    for i in X:
        value = int(i)
        count_X[value] += 1
    
    for i in Y:
        value = int(i)
        count_Y[value] += 1
    
    for i in range(9,-1,-1):
        value = str(i) * min(count_X[i],count_Y[i])
        answer += value
 
    if(len(answer) == 0):
        return '-1'
    if(answer[0] == '0'):
        return '0'
    
    return answer