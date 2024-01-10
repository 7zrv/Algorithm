def solution(absolutes, signs):
    answer = 0
    
    for i, sign in zip(absolutes, signs):
        if sign == True:
            answer += i
        else:
            answer += i * -1
    return answer