def solution(data, ext, val_ext, sort_by):
    
    col = ['code', 'date', 'maximum', 'remain']
    ext = col.index(ext)
    sort_by = col.index(sort_by)
    
    answer = []
    
    for i in data:
        if i[ext] < val_ext:
            answer.append(i)
        
    answer = sorted(answer, key=lambda x:x[sort_by])   
    return answer