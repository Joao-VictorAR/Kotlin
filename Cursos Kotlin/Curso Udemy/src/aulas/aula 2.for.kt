fun main() {

    var str: String = "Gabriel Ferreira"
    for (c in str) {
        println(c)
    }

    for(i in 1..40 step 2) {
        if (i != 31) {
            println("$i ")
        }
    }
    for(j in 30 downTo 0) {
        println("$j")
    }
}

