def solution(s):
    answer = []
    count_round = 0
    count_zero = 0
    len_s = 0
    
    while s != "1":
        
        count_round += 1
        count_zero += s.count('0')
        s = s.replace('0', '')
        s = str(format(len(s), 'b'))
    
    answer.append(count_round)
    answer.append(count_zero)
        
    return answer