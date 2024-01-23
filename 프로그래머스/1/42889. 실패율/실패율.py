def solution(N, stages):
    answer = []
    
    arr = set(stages)
    dic = dict()
    users = len(stages)
    
    for i in range(1, N+1):
        dic[i] = 0
    
    for i in stages:
        if i <= N:
            dic[i] += 1
        
    for i in dic:
        temp = dic[i]
        if users > 0:
            dic[i] = dic[i] / users
            users -= temp
        
    sorted_dic = sorted(dic.items(), key= lambda item:item[1], reverse=True)
    
    for i in sorted_dic:
        answer.append(i[0])
    
    return answer