def swap_players(cur, players):
    
    players[cur], players[cur-1] = players[cur-1], players[cur] 
    return players

def solution(players, callings):
    
    result = {player: i for i, player in enumerate(players)}
    
    for call in callings:
        idx = result[call] 
        result[call] -= 1 
        result[players[idx-1]] += 1
        
        swap_players(idx, players)
        
    return players