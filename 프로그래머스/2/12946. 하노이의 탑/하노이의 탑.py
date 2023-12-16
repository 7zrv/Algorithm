result = []
    
def hanoi(n, start, src, asi):
    if n == 1:
        result.append([start,src])
        return result
    else:
        hanoi(n-1, start, asi, src)
        result.append([start,src])
        hanoi(n-1, asi, src, start) 

def solution(n):
    
    hanoi(n, 1, 3, 2)
    
    return result