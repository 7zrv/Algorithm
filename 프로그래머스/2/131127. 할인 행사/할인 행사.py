def solution(want, number, discount):
    answer = 0
    want_dic = {}
    count = 0
    
    for i, j in zip(want, number):
            want_dic[i] = j
    
    
    while count <= len(discount) - 10:
    
        discount_dic = {}
    
        for i in discount[count:count+10]:
            if i in discount_dic:
                discount_dic[i] += 1
            else:
                discount_dic[i] = 1
        
        if discount_dic == want_dic:
            answer += 1
        
        count += 1
        
        
            
    
    return answer