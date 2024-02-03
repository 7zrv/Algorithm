def solution(x):
    answer = True
    x = str(x)
    sum_x = 0

    for i in x:
        sum_x += int(i)
        
    if int(x) % sum_x == 0:
        return True
    else:
        return False
    
    return answer