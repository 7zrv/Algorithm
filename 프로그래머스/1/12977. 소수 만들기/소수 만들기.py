def check_prime(num):
    for i in range(2, num // 2):
        if num % i == 0:         
            return False
    
    return True
    
def solution(nums):
    answer = 0

    for i in range(len(nums)):
        for j in range(i+1, len(nums)):
            for k in range(j+1, len(nums)):
                if check_prime(nums[i] + nums[j] + nums[k]):
                    answer += 1
                
    return answer