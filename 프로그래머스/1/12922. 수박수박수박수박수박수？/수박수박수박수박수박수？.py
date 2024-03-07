def solution(n):
    answer = ''
    a = '수'
    b = '박'
    
    for i in range(1, n+1):
        if i % 2 == 1:
            answer += a
        else:
            answer += b
    
    return answer