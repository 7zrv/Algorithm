def solution(arr):
    answer = []
    
    if arr[0] != 10:
        arr.remove(min(arr))
    else:
        return [-1]
        
    return arr