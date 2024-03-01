def solution(n):
    answer = 0
    route = n **(1/2)
    
    if route % 1 == 0:
        return (route + 1)**2
    else:
        return -1
    return answer