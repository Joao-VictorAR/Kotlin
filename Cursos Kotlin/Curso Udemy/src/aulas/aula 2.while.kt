fun operacao (a: Int, b: Int, c: String)  {

   /* when (c){

        "soma" -> {
            return a + b
        }

        "subtração" -> return a - b

        else -> {
            println("operação incorreta")
            return 0
        }

    }*/

    when {
        a > 0 && b > 0 -> {
            println("variaveis maiores que zero")
        }
    }

    when  (a){
         in 1..99 -> println("a esta na casa das dezenas")
        else -> {
            println("a nao esta na casa das dezenas")
        }
    }

}


fun main() {
    val teste: Int? = null
    val op: Int = teste ?: 100
    println("$op")

    operacao(10,10, "soma")
    operacao(100,10, "subtração")
}