def solution(str1, str2):
    answer = 0
    str1, str2 = str1.upper(), str2.upper()
    intersection = {}
    union = {}
    inter = 0
    uni = 0
    
    arr1 = []
    arr2 = []
    
    dic1 = {}
    dic2 = {}
    
    
    
    for i in range(len(str1)-1):
        if str1[i].isalpha() and str1[i+1].isalpha():
            arr1.append(str1[i]+str1[i+1])
            
    for i in range(len(str2)-1):
        if str2[i].isalpha() and str2[i+1].isalpha():
            arr2.append(str2[i]+str2[i+1])
            
    for i in arr1:
        
        if i in dic1:
            dic1[i] += 1
        else:
            dic1[i] = 1
                
    for i in arr2:
        if i in dic2:
            dic2[i] += 1
        else:
            dic2[i] = 1
                
    union = dic2
                
    for i in dic1:
        if i in dic2:
            intersection[i] = min(dic1[i], dic2[i])
            union[i] = max(dic1[i], dic2[i])
        else:
            union[i] = dic1[i] 
    
    for i in intersection:
        inter += intersection[i] 
    
    for i in union:
        uni += union[i]
    
    if inter != 0 and uni != 0:
        answer = int((inter / uni) * 65536)
    elif inter == 0 and uni == 0:
        return 65536
    else:
        return 0
    
    return answer