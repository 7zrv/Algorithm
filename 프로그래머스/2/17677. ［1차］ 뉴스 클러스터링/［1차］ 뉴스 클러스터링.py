def solution(str1, str2):
    answer = 0
    
    str1, str2 = str1.upper(), str2.upper()
    
    arr1 = [str1[i:i+2] for i in range(len(str1) - 1) if str1[i:i+2].isalpha()]
    arr2 = [str2[i:i+2] for i in range(len(str2) - 1) if str2[i:i+2].isalpha()]
            
    print(arr1)
    print(arr2)
    
    intersection = {}
    union = {}
    
    dic1 = {}
    dic2 = {}
    
    for i in arr1:
        dic1[i] = dic1.get(i, 0) + 1
        
    for i in arr2:
        dic2[i] = dic2.get(i, 0) + 1
                
    print(dic1)
    print(dic2)
                
    for i in dic1:
        if i in dic2:
            intersection[i] = min(dic1[i], dic2[i])
            
    union = dic1.copy()
    
    for i in dic2:
        if i in union:
            union[i] = max(dic1[i], dic2[i])
        else:
            union[i] = union.get(i, dic2[i])
    
    print(intersection)
    print(union)
    
    sum_intersection = sum(intersection.values())
    sum_union = sum(union.values())
    
    if sum_intersection != 0 and sum_union != 0:
        answer = int((sum_intersection / sum_union) * 65536)
    elif sum_intersection == 0 and sum_union == 0:
        return 65536
    else:
        return 0
    
    return answer