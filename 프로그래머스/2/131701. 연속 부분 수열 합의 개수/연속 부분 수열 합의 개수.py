def solution(elements):
    answer = set()
    cir = elements + elements
    
    for i in range(len(elements)):
        for j in range(len(elements)):
            answer.add(sum(cir[i:i+j]))
            
    return len(answer)