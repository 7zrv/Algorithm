def solution(citations):
    
    citations = sorted(citations)
    h = len(citations)

    for i in citations:
        if i >= h:
            break
        else:
            h -= 1
    
    return h