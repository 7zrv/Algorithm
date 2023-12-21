def find_divisor(number):
    
    count = 0
    
    for idx in range(1, int(number**(1/2)) + 1):
        if number % idx == 0:
            count += 1
            if ( (idx**2) != number) : 
                count += 1
                
            
    return count 

def solution(number, limit, power):
    answer = 0
    divisors = []
     
    for idx in range(1, number+1):
        divisors.append(find_divisor(idx))
        
    for i in range(len(divisors)):
        if divisors[i] > limit:
            divisors[i] = power
        answer += divisors[i]    
        
    return answer