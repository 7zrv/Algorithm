def solution(survey, choices):
    answer = ''
    
    dic1 = {'R':0, 'C':0, 'J':0, 'A':0}
    dic2 = {'T':0, 'F':0, 'M':0, 'N':0}
    
    for i in zip(survey, choices):
        if i[1] < 4:
            if i[0][0] in dic1:
                dic1[i[0][0]] += 4 - i[1]
            else:
                dic2[i[0][0]] += 4 - i[1]
        elif i[1] > 4:
            if i[0][1] in dic1:
                dic1[i[0][1]] += i[1] - 4
            else:
                dic2[i[0][1]] += i[1] - 4
            
    for key1, key2 in zip(dic1, dic2):
        if dic1[key1] > dic2[key2]:
            answer += key1
        elif dic1[key1] < dic2[key2]:
            answer += key2
        else:
            if key1 < key2:
                answer += key1
            else:
                answer += key2
                
    return answer