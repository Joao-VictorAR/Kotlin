fun main() {

    var n: Int = 0
    while (n < 20) {
        println(n)
        n++

        if (n == 12) {
            break
        }
    }

    var l: Int = 10
    do {
        println(l)
        l += 5
    } while (l <= 100)

}

