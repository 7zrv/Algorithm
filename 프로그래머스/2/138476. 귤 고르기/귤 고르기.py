def solution(k, tangerine):
    answer = 0
    
    tangerine.sort()
    dic = {}
    
    for i in tangerine:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    
    dic = sorted(dic.items(), key=lambda x : x[1], reverse=True)

    for i in range(len(dic)):
        if k <= 0:
            break
        else:
            k -= dic[i][1]
            answer += 1
        
    return answer