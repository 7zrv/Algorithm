def solution(n):
    divisor = []
    answer = 0
    if n == 1:
        return 1
    
    
    for i in range(1, n // 2):
        if n % i == 0:
            divisor.append(i)
            divisor.append(n // i)
    
    divisor = set(divisor)
    answer = sum(divisor)
    
    return answer