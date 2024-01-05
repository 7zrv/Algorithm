def solution(n):
    answer = 1
    start, end = 1, 1
    interval_sum = 0

    
    
    while start < n // 2 + 1:
        if interval_sum < n:
            interval_sum += end
            end += 1
        elif interval_sum > n:
            interval_sum -= start
            start += 1
        else:
            answer += 1
            interval_sum -= start
            start += 1

    return answer
