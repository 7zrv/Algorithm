def solution(s):
    answer = ''
    arr = [' ']
    
    for i in s:
        arr.append(i.lower())
        
    for i in range(1, len(arr)):
        if arr[i-1] == ' ':
            answer += arr[i].upper()
        else:
            answer += arr[i]

    return answer