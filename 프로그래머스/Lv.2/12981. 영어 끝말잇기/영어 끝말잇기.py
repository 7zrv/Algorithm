def solution(n, words):
    answer = []
    arr = []
    
    arr.append(words[0])
    
    for i in range(1, len(words)):
        
        if words[i] in arr or words[i-1][-1] != words[i][0]:
            answer.append((i % n) + 1)
            answer.append((i // n) + 1)
            return answer
            
        arr.append(words[i])
    
    return [0, 0]