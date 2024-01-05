def solution(n):
    answer = 0
    
    n_one = str(format(n, 'b')).count('1')
    
    while True:
        
        n += 1
        next_one = str(format(n, 'b')).count('1')
        
        if next_one == n_one:
            return n
    
    return answer