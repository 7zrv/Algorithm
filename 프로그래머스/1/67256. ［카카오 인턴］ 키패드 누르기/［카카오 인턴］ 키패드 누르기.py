def solution(numbers, hand):
    answer = ''
    left = [3, 0]
    right = [3, 2]
    
    pad = {1 : [0, 0], 2: [0, 1], 3: [0, 2],
          4 : [1, 0], 5: [1, 1], 6: [1, 2],
          7 : [2, 0], 8: [2, 1], 9: [2, 2], 0: [3, 1]}
    
    for i in numbers:
        if i in [1, 4, 7]:
            left = pad[i]
            print('left', left)
            answer += 'L'
        elif i in [3, 6, 9]:
            right = pad[i]
            print('right', right)
            answer += 'R'
        else:
            dis_left = abs(left[0] - pad[i][0]) + abs(left[1] - pad[i][1])
            dis_right = abs(right[0] - pad[i][0]) + abs(right[1] - pad[i][1])
            
            if dis_left < dis_right:
                left = pad[i]
                print('left', left)
                answer += 'L'
            elif dis_left > dis_right:
                right = pad[i]
                print('right',right)
                answer += 'R'
            else:
                if hand == 'right':
                    right = pad[i]
                    answer += 'R'
                else:
                    left = pad[i]
                    answer += 'L'
    
    return answer