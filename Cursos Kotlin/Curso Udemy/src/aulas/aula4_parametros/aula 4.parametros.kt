fun enredeco(rua: String = "", cidade: String, estado: String, cep: String, numero: Int = 0){
    println("Rua: $rua")
println("cidade: $cidade, $estado, $cep")
}

fun media(vararg notas: Float) {

    if (notas.isNotEmpty()) {
        var soma = 0f

        for (nota in notas) {
            soma += nota
        }

        println("A media é: ${soma/notas.size}")
    }
}

fun <T> media2(vararg valores: T) {
    for (valor in valores){
        println(valor)
    }
}

fun main() {

    enredeco(cidade = "brasilia", estado = "DF", cep = "15")
    media(5.5f, 8.2f, 10f)
    media2(2.5f, 6, "", false)

    val str = "Lorem ipsum"

    str.capitalize()
    str.decapitalize()
    str.contains("ba")
    str.startsWith("L")
    str.startsWith("l")

    arrayOf(1,2,3,4,5)
}

