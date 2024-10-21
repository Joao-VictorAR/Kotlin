fun maiorDeIdade(idade: Int) {
    if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}


fun calculaSalario(cargo: String, salario: Float): Float {

    val bonus: Float

    if (cargo == "Cordenador") {
        bonus = salario * 2
    } else if (cargo == "Gerente Junior") {
        bonus = salario * 1.5f
    } else {
        bonus = salario * 1.2f
    }

    return bonus

}

/*fun CalculaSalario(cargo: String, salario: Float): Float {

    return if (cargo == "Cordenador") {
         salario * 2
    } else if (cargo == "Gerente Junior") {
        salario * 1.5f
    } else {
        salario * 1.f
    }

}*/


fun main() {
    maiorDeIdade(10)
    maiorDeIdade(18)
    maiorDeIdade(40)

    println(calculaSalario("professor", 1000f))
    println(calculaSalario("Gerente Junior", 1000f))
    println(calculaSalario("Cordenador", 1000f))

    val valor = 10
    val resposta: String = if (valor == 10) "sim" else "não"
    println("$resposta")
}
