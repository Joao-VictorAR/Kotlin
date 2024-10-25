class maquin (var marca: String) {

    var nucleos: Int = 0
        get () {
            println("Get foi chamado")
            return field
        }
        set (value) {
            println("Set foi chamado")
            field = value
        }

    fun ligar () {

    }

    fun processar () {

    }

    fun desligar () {

    }
}

fun main() {
        var tv = maquin("sansumg")
        println(tv.nucleos)
        tv.nucleos= 10

    /*tv.ligar()
    tv.processar()
    tv.desligar()*/

    with (tv) {
        ligar()
        processar()
        desligar()
    }

}
