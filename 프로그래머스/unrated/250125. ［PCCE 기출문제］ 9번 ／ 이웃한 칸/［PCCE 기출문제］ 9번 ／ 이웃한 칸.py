def in_range(x, y, n):
    return 0 <= x < n and 0 <= y < n

def solution(board, h, w):
    
    count = 0
    
    dir_h = [1, -1, 0, 0]
    dir_w = [0, 0, 1, -1]
    
    
    for ht, wt in zip(dir_h, dir_w):
        t1, t2 = h + ht, w + wt
        
        
        if not in_range(t1, t2, len(board)):
            continue
        else:
            if board[h][w] == board[t1][t2]:
                count += 1
    
    answer = count
    return answer