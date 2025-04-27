import "sort"

func solution(n int, lost []int, reserve []int) int {
    sort.Ints(lost)
    sort.Ints(reserve)

    lostMap := make(map[int]bool)
    reserveMap := make(map[int]bool)

    for _, l := range lost {
        lostMap[l] = true
    }
    for _, r := range reserve {
        reserveMap[r] = true
    }

    for student := range lostMap {
        if reserveMap[student] {
            delete(lostMap, student)
            delete(reserveMap, student)
        }
    }

    lostList := []int{}
    for student := range lostMap {
        lostList = append(lostList, student)
    }
    sort.Ints(lostList)

    for _, student := range lostList {
        if reserveMap[student-1] {
            delete(reserveMap, student-1)
            delete(lostMap, student)
        } else if reserveMap[student+1] {
            delete(reserveMap, student+1)
            delete(lostMap, student)
        }
    }

    return n - len(lostMap)
}
