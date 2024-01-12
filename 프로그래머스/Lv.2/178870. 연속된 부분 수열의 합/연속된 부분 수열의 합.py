def solution(sequence, k):
    answer = []
    arr = []
    start, end = 0, -1
    count = 0
    
    while True:
        
        if count < k:
            end += 1
            if end >= len(sequence):
                break
            count += sequence[end]
                
        else:
            count -= sequence[start]
            if start >= len(sequence):
                break
            start += 1
            
        if count == k:
            answer.append([start, end])      
            
        
    for i in answer:
        arr.append(i[1] - i[0])
        
    
    return answer[arr.index(min(arr))]