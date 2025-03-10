import "strings"

func StringReverse(s string) string {
    var sb strings.Builder
    sb.Grow(len(s)) 

    for i := len(s) - 1; i >= 0; i-- {
        sb.WriteByte(s[i])
    }

    return sb.String()
}

func solution(my_string string) string {
    
    return StringReverse(my_string)
}