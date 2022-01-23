class Baz {
    init {
        println("Baz init")
    }
    val s: String = "baz"
}

class Zot {
    init {
        println("Zot init")
    }
    val b : Baz = Baz()

    fun d() {
        println(b)
    }
}

fun main() {
    var z = Zot()
    z.d()
}
