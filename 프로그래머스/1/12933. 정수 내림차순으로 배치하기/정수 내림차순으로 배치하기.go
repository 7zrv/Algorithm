import (
    "sort"
    "strconv"
    "strings"
)

func solution(n int64) int64 {
    s := strconv.FormatInt(n, 10)

    digits := strings.Split(s, "")

    sort.Slice(digits, func(i, j int) bool {
        return digits[i] > digits[j]
    })

    sortedStr := strings.Join(digits, "")
    result, _ := strconv.ParseInt(sortedStr, 10, 64)

    return result
}
