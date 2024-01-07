def solution(friends, gifts):
    
    f_index = {friend : i for i, friend in enumerate(friends)}
    gift_point = {friend : 0 for friend in friends}
    arr = [[0 for j in range(len(friends))] for i in range(len(friends))]
    get_gift = {friend : 0 for friend in friends}
    
    for i in gifts:
        i = i.split(' ')
        gift_point[i[0]] += 1
        gift_point[i[1]] -= 1
        arr[f_index[i[0]]][f_index[i[1]]] += 1

    for i in range(len(arr)):
        for j in range(len(arr)):
            if i != j and (arr[i][j] != 'X' and arr[j][i] != 'X'):
                if arr[i][j] > arr[j][i]:
                    get_gift[friends[i]] += 1
                elif (arr[i][j] == 0 and arr[j][i] == 0) or arr[i][j] == arr[j][i]:
                    if gift_point[friends[i]] > gift_point[friends[j]]:
                        get_gift[friends[i]] += 1
                        arr[j][i] = 'X'
                    elif gift_point[friends[i]] < gift_point[friends[j]]:
                        get_gift[friends[j]] += 1
                        arr[i][j] = 'X'
                    else:
                        arr[i][j] = 'X'
                        arr[j][i] = 'X'
                        
    return get_gift[max(get_gift, key=get_gift.get) ]           