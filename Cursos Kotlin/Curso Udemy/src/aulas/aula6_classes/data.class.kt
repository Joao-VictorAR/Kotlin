class quadrado(val area: Int)

data class triangulo(val area: Int)

fun main() {

    val q1: quadrado = quadrado(10)
    val q2: quadrado = quadrado(10)

    val t1 = triangulo(5)
    val t2 = triangulo(5)

    println(q1)
    println(t1)

    println(q1 == q2)
    println(t1 == t2)

    val t3 = t2.copy()
    println(t3)


}  