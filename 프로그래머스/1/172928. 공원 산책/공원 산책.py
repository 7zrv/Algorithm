def solution(park, routes):
    
    dir = { 'E' : [0, 1], 'W' : [0, -1], 'S' : [1, 0], 'N' : [-1, 0] }
    
    cur = [[i, park[i].find('S')] for i in range(len(park)) if 'S' in park[i]]
    cur = cur[0]
    
    
    max_dis_x = len(park[0])
    max_dis_y = len(park)
    refined_route = []
    
    for route in routes:
        refined_route.append([dir[route[0]], route[2]])
    
        
    for route in refined_route:
        
        prev = cur
        print(cur, 'now')
        
        for i in range(int(route[1])):
            
            y, x = cur[0] + route[0][0], cur[1] + route[0][1]
            
            if y < max_dis_y and y > -1 and x < max_dis_x and x > -1:
                
                if park[y][x] == 'O' or park[y][x] == 'S':
                    cur = [y, x]
                    print(cur, 'suc')
                else:
                    cur = prev
                    break
            else:
                cur = prev
                print('fail')
                break            
    
    return cur