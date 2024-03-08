def solution(s):
    
    if len(s) not in [4, 6]:
        return False
    else:
        if s.isdigit():
            return True
        else:
            return False
    
    