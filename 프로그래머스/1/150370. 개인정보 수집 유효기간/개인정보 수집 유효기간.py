def calculate_date(date, month):
    date = date.split(".")
    date = list(map(int, date))
    
    date[0] += month // 12
    date[1] += month % 12
    date[2] -= 1
    if date[2] < 1:
        date[2] = 28
        date[1] -= 1
    if date[1] > 12:
        date[1] = date[1] - 12
        date[0] += 1
    
    print(date)
    print('------------------------')
    return date

def compare_dates(date1, date2):
    if date1[0] != date2[0]:
        return date1[0] > date2[0]
    elif date1[1] != date2[1]:
        return date1[1] > date2[1]
    else:
        return date1[2] > date2[2]


def solution(today, terms, privacies):
    answer = []
    
    today = list(map(int, today.split('.')))
    
    dic = {}
    
    for i in range(len(terms)):
        terms[i] = terms[i].split(" ")
        dic[terms[i][0]] = terms[i][1] 
    
    for i in range(len(privacies)):
        kind = privacies[i].split(" ")
        delete_date = calculate_date(kind[0], int(dic[kind[1]]))
        
        if compare_dates(today, delete_date):
            answer.append(i + 1)
        
                    
        
    
    return answer