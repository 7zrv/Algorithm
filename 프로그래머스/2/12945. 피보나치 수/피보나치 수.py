def solution(n):
    answer = 0
    fib = [0, 1]
    
    while len(fib) <= n:
        fib.append(fib[len(fib)-1] + fib[len(fib)-2])
            
    return fib[n] % 1234567