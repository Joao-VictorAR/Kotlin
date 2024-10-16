
fun multi(a: Int, b: Int) {
    println("a multiplicação é ${a * b}")
}

fun divisao(a: Int, b: Int, c: Int) = "${a / b / c}"

fun hello(nome: String) : String {
    return "Olá, Mundo"
}


fun main() {
    println(hello("joao"))
    val a: Int = 10
    val b: Float = 15.2f
    println(" o primeiro numero é $a e o segundo é $b e a soma deles é ${a + b}")
    val str: String = """pode digitar
        |textos em linhas diferentes
        |sem dar erro
    """.trimMargin()
    println(" $str")
    println(multi(5, 2))
    println(divisao(100, 4, 5))
}