import "strings"

func solution(my_string string) string {
    
    var result strings.Builder
    
    vowels := map[rune]bool{'a': true, 'e': true, 'i': true, 'o': true, 'u': true}

    for _, ch := range my_string {
        if !vowels[ch] { 
            result.WriteRune(ch)
        }
    }

    return result.String()
}
