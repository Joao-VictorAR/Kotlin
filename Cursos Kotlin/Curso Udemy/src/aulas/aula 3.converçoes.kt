
fun t (n1: Int){

}

fun main() {

    val n1: Double = Double.MAX_VALUE
    val b1: Byte = 100

    println(n1.toLong())
    println(b1.toLong())
    println(b1.toDouble())
    println("10".toInt())

    try {
        println("ola, mundo".toInt())
    }   catch (e: NumberFormatException) {
        println("não é um numero")
    }   catch (e: Exception) {
        println("Algo de errado ocorreu")
    }   finally{
        println("tudo bem, estou ciente do erro")
    }

    val str: String? = null

    println(str?.length)

    if (str != null) {
        println(str.length)
    }

}

