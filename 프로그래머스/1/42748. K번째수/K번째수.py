def solution(array, commands):
    answer = []
    arr = []
    
    for i, j, k in commands:
        arr = array[i-1:j]
        arr = sorted(arr)
        answer.append(arr[k-1])
        
    return answer