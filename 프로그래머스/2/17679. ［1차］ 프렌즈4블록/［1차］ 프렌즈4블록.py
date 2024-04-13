def solution(m, n, board):
    answer = 0
    
    board = list(map(list, board))
    
    
    while True:
        delete_list = set()

        for i in range(n-1):
            for j in range(m-1):
                if board[j][i] != 'X' and board[j][i] == board[j][i+1] == board[j+1][i] == board[j+1][i+1]:
                    delete_list.add((j, i))
                    delete_list.add((j, i+1))
                    delete_list.add((j+1, i))
                    delete_list.add((j+1, i+1))
                    
        if not delete_list:
            break

        for x in delete_list:
            board[x[0]][x[1]] = 'X'
            answer += 1

        for i in range(n):
            for j in range(m):
                for k in range(m-1, 0, -1):
                    if board[k-1][i] != 'X' and board[k][i] == 'X':
                        board[k-1][i], board[k][i] = board[k][i], board[k-1][i] 
    
    return answer