def solution(n):
    answer = ''
    n = str(n)
    arr = []
    
    for i in n:
        arr.append(i)
        
    arr.sort(reverse=True)
    
    for i in arr:
        answer += i
    
    return int(answer)