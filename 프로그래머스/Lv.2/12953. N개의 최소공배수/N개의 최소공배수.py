def solution(arr):
    answer = 0
    idx = 1
    max_num = max(arr)
    num = max_num
    
    while True:
        
        all_pass = True
        
        for i in arr:
            if num % i != 0:
                all_pass = False
        
        if all_pass == True:
            return num
        else:
            num += max_num
            
            
    return answer