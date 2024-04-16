def solution(bridge_length, weight, truck_weights):
    answer = 0
    on_bridge = [0 for i in range(bridge_length)]
    sum_weight = 0
    
    if sum_weight + truck_weights[0] <= weight and len(on_bridge) <= bridge_length:
            on_bridge.pop(0)
            on_bridge.append(truck_weights[0])
            sum_weight += truck_weights[0]
            truck_weights.pop(0)
            answer += 1
    
    while sum_weight != 0:
        if truck_weights:
            if sum_weight + truck_weights[0] <= weight and len(on_bridge) <= bridge_length:
                sum_weight -= on_bridge[0]
                on_bridge.pop(0)
                on_bridge.append(truck_weights[0])
                sum_weight += truck_weights[0]
                truck_weights.pop(0)
                answer += 1
            else:
                sum_weight -= on_bridge[0]
                on_bridge.pop(0)
                if sum_weight + truck_weights[0] <= weight and len(on_bridge) < bridge_length:
                    on_bridge.append(truck_weights[0])
                    sum_weight += truck_weights[0]
                    truck_weights.pop(0)
                else:
                    on_bridge.append(0)
                answer += 1
        else:
            sum_weight -= on_bridge[0]
            on_bridge.pop(0)
            on_bridge.append(0)
            answer += 1
        
    return answer