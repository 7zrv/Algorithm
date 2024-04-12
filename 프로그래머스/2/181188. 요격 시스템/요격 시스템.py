def solution(targets):
    answer = 0
    
    #미사일 범위의 끝나는 부분을 기준으로 정렬
    targets = sorted(targets, key = lambda x : x[1])

    end = 0
    
    for target in targets :
        #이전 타겟과 겹치는 부분이 없다면 발사
        if target[0] >= end :
            end = target[1]
            answer += 1
        
    return answer