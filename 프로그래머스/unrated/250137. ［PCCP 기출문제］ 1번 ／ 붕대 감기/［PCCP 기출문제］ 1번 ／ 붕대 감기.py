def solution(bandage, health, attacks):
    
    health_limit = health
    atk_count = 0
    dur = 0
    
    for time in range(0, attacks[-1][0] + 1):
        
        print(time, dur)
        
        if time == attacks[atk_count][0]:
            health -= attacks[atk_count][1]
            atk_count += 1
            dur = 0
            
            if health <= 0:
                return -1
            
            
            
        else:
            dur += 1
            if dur > 0:
                health += bandage[1]
            
            if dur == bandage[0]:
                health += bandage[2]
                dur = 0
                
            if health > health_limit:
                health = health_limit
                
        print(health)
            
        
    if health <= 0:
        health = -1
       
    answer = health
    return answer

