def solution(s):
    answer = 0
    spin = []
    bracket = { ')' : '(', ']' : '[', '}' : '{'}
    
    for i in range(len(s)):
        spin.append(s[i::] + s[0:i])
        
    for i in spin:
        stack = []
        for j in i:
            if stack and j in bracket:
                if stack[-1] == bracket[j]:
                    stack.pop()
                else:
                    break
            else:
                stack.append(j)
                
        if not stack:
            answer += 1
            
        
    return answer