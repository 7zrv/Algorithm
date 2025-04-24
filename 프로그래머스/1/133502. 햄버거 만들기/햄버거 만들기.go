func solution(ingredient []int) int {
    stack := []int{}
    count := 0

    for _, ing := range ingredient {
        stack = append(stack, ing)

        if len(stack) >= 4 {
            l := len(stack)
            if stack[l-4] == 1 && stack[l-3] == 2 && stack[l-2] == 3 && stack[l-1] == 1 {
               
                stack = stack[:l-4]
                count++
            }
        }
    }

    return count
}
