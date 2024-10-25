open class maquina(val marca: String) {
    open fun minhaMarca() {
        println("minha marca é $marca")
    }
}

class computador(marca: String, val nucelos: Int) : maquina(marca) {

    override fun minhaMarca() {
        println("Estou rescrevendo minha marca")
    }

    fun overload(i: Int) {
        println("overload 1")

    }

    fun overload(i: Int, b : String) {
        println("overload 2")

    }

    private fun ligar() {}
    fun desligar() {}
}


fun main() {

    val c1: computador = computador("intel", 10)
    with(c1) {
        //ligar()
        desligar()
        minhaMarca()
        overload(10)
        overload(5, "segunda frase")
    }
}