class constants {

    companion object {
        val TABLE = "pessoa"

        fun teste() {
            println("Sou um método estático")
        }
    }

    object VENDAS {
        val TABLE_NAME = "Vendas"

        object COLUNAS{
            val ID = "ID"
            val TOTAL = "Total"
        }
    }
}

fun main() {
    println(constants.TABLE)
    constants.teste()

    constants.VENDAS.COLUNAS.TOTAL
}