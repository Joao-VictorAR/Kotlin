enum class prioridade {
    BAIXA, MEDIA, ALTA
}

enum class prioridade1(val id: Int) {
    BAIXA(1){
        override fun toString(): String {
            return "Infelizmente você nao foi bem"
        }
    }
    , MEDIA(5), ALTA(10)
}

class alarme(var desc: String, p: prioridade1)

fun main() {

    println(prioridade1.BAIXA.id)

    alarme("aviso", prioridade1.ALTA)

    for (p in prioridade1.values()) {
        println("$p - ${p.id} - ${p.ordinal}")
        if (p.toString() == "MEDIA") {
            println("Não precisa fazer agora")
        }
    }
}