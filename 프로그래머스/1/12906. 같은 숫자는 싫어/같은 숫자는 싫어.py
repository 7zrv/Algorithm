def solution(arr):
    answer = []
    
    answer.append(arr[0])
    
    for element in arr:
        if element != answer[-1]:
            answer.append(element)
            
    return answer