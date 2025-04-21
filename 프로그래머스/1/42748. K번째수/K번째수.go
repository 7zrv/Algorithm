import (
    "sort"
)

func solution(array []int, commands [][]int) []int {
    result := []int{}

    for _, cmd := range commands {
        i, j, k := cmd[0], cmd[1], cmd[2]

        sliced := make([]int, j-i+1)
        copy(sliced, array[i-1:j])

        sort.Ints(sliced)

        result = append(result, sliced[k-1])
    }

    return result
}
