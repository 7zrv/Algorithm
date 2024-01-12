def solution(lottos, win_nums):
    answer = []
    
    count = 0
    count_zero = 0
    win = len(win_nums) + 1
    
    for i in lottos:
        if i in win_nums:
            count += 1
        elif i == 0:
            count_zero += 1
    
    if count_zero == 6:
        answer.append(1)
        answer.append(6)
    elif count == 0 and count_zero == 0:
        answer.append(6)
        answer.append(6)
    elif win - count >= 6:
        answer.append(win - (count + count_zero))
        answer.append(6)
    else:
        answer.append(win - (count + count_zero))
        answer.append(win - count)
    
    return answer