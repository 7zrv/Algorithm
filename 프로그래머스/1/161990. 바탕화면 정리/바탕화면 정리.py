def check(x, y, dir):
    
    if y < dir['luy']:
        dir['luy'] = y
    
    if y > dir['rdy']:
        dir['rdy'] = y
    
    if x < dir['lux']:
        dir['lux'] = x
    
    if x > dir['rdx']:
        dir['rdx'] = x
    
    return dir

def solution(wallpaper):
    
    dis_y = len(wallpaper)
    dis_x = len(wallpaper[0])
    
    dir = {'luy' : dis_y + 1, 'lux' : dis_x + 1, 'rdy' : 0, 'rdx' : 0}
    
    
    for y in range(dis_y):
        for x in range(dis_x):
            if wallpaper[y][x] == '#':
                dir = check(x, y, dir)
                
    dir['rdy'] += 1
    dir['rdx'] += 1
    
    answer = [dir['luy'], dir['lux'], dir['rdy'], dir['rdx'],]
    return answer