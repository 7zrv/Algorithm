def check_ones(arr, i, j):
    
    i += 1
    j += 1
    
    dir_1 = [-1, -1, 0, 1, 1, 1, 0, -1]
    dir_2 = [0, 1, 1, 1, 0, -1, -1, -1]
    
    arr[i][j] = 1
    
    for y, x in zip(dir_1, dir_2):
        arr[i + y][j + x] = 1
        
    return arr
    
def unpadding(arr):
    
    arr = arr[1: -1]
    unpadded = []
    
    for row in arr: 
        row = row[1:-1]
        unpadded.append(row)
        
    return unpadded

def count_ones(arr):
    
    count = 0
    
    for i in arr:
        count += i.count(0)
    
    return count

def solution(board):
    answer = []
    
    padded = [[0 for col in range(len(board[0]) + 2)] for row in range(len(board)+2)]
    
    for i in range(len(board)):
        for j in range(len(board[0])):
            
            if board[i][j] == 1:
                padded = check_ones(padded, i, j)
    
    answer = unpadding(padded)
    
    for i in answer:
        print(i)
    
    return count_ones(answer)