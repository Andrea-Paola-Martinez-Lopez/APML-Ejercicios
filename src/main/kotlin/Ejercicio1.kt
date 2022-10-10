import kotlin.math.*

fun calculatoraCientifica(funcion: String, valor: Int) {
    for (i in 1..valor) {
        val v =
            when (funcion) {
                "sin" -> sin(i.toDouble())
                "cos" -> cos(i.toDouble())
                "tan" -> tan(i.toDouble())
                "exp" -> exp(i.toDouble())
                "ln" -> ln(i.toDouble())
                else -> 0.0
            }
        if (v < 0) {
            println("$i = $v")
        } else {
            println("$i = $v")
        }
    }
}

fun main() {
    println("Ingresa valor: ")
    val valor = readLine()!!.toInt()
    println("Funcion a aplicar\nSeno(sin), Coseno(cos), tangente(tan) \nExponencial(exp), logaritmo(ln)")
    println("Ingresa funcion abreviada")
    val funcion = readLine().toString()
    calculatoraCientifica(funcion, valor)
}