func solution(wallpaper []string) []int {
    lux, luy := 51, 51
    rdx, rdy := -1, -1

    for i, row := range wallpaper {
        for j, cell := range row {
            if cell == '#' {
                if i < lux {
                    lux = i
                }
                if j < luy {
                    luy = j
                }
                if i+1 > rdx {
                    rdx = i + 1
                }
                if j+1 > rdy {
                    rdy = j + 1
                }
            }
        }
    }

    return []int{lux, luy, rdx, rdy}
}
