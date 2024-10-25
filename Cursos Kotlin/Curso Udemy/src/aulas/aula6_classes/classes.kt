class Pessoa1

class Pessoa2 (var nome: String, var anoNascimento: Int)

class Pessoa3 (var nome: String) {

    var ano: Int? = null

    constructor(nome: String, anoNascimento: Int) : this (nome) {
        this.ano = anoNascimento
    }


    fun saudacao() {
        println("Ola, meu nome é $nome e nasci em $ano")
    }
}

fun main() {

    val pessoa1: Pessoa3 = Pessoa3("gabriel")
    val pessoa2: Pessoa3 = Pessoa3("gabriel", 2000)
    println(pessoa2.nome)

    pessoa2.saudacao()

}