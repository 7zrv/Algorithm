def solution(arr1, arr2):
    answer = [[0 for col in range(len(arr2[0]))] for row in range(len(arr1))]
    
    for i in range(len(answer)):
        for j in range(len(arr2[0])):
            for k in range(len(arr2)):
                
                answer[i][j] += arr2[k][j] * arr1[i][k] 
        
    print(answer)
    
    
    return answer