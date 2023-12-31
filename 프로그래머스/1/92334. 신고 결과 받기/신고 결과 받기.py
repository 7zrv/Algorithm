def solution(id_list, report, k):
    answer = []
    id_dic = {}
    result_dic = {}
    
    for i in id_list:
        id_dic[i] = 0
    
    result_dic = id_dic.copy()
    report = set(report)
    report = list(report)
    
    for i in range(len(report)):
        report[i] = report[i].split(' ')
    
    for i in report:
        id_dic[i[1]] += 1
    
    for i in report:
        if id_dic[i[1]] >= k:
            result_dic[i[0]] += 1
            
    answer = list(result_dic.values())
        
    return answer