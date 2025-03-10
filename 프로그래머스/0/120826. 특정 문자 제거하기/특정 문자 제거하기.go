import "strings"

func solution(my_string string, letter string) string {
    
    return strings.Replace(my_string, letter, "", -1)
}