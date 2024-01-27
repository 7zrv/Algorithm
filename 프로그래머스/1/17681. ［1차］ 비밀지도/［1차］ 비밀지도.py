def solution(n, arr1, arr2):
    
    answer = ['' for i in range(n)]
    
    for i in range(n):
        arr1[i] = format(arr1[i], 'b')
        arr2[i] = format(arr2[i], 'b')
    
    for i in range(n):
        while len(arr1[i]) < n:
             arr1[i] = '0' + arr1[i]
        while len(arr2[i]) < n:
             arr2[i] = '0' + arr2[i]
    
    for i in range(n):
        for j in range(n):
            if arr1[i][j] == '1' or arr2[i][j] == '1':
                answer[i] = answer[i] + '#'
            else:
                answer[i] = answer[i] + ' '
    
    return answer