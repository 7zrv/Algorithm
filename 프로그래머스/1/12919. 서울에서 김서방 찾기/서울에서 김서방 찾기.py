def solution(seoul):
    answer = '김서방은 n에 있다'
    
    for i in range(len(seoul)):
        if seoul[i] == 'Kim':
            answer = answer.replace('n', str(i))
    
    
    return answer