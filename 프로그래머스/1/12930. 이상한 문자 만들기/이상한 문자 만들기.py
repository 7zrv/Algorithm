def solution(s):
    answer = ''
    s = s.split(' ')
    
    for i in range(len(s)):
        for j in range(len(s[i])):
            if (j+1) % 2 == 0:
                answer += s[i][j].lower()
            else:
                answer += s[i][j].upper()
        if i == len(s)-1:
            break
        else:
            answer+= ' '
            
    return answer