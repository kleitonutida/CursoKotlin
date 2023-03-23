package fundamentos.operadores

data class Carro(val marca: String, val modelo: String)

fun main(args: Array<String>) {
    /**
     * Utilização do operador destructuring em cima de uma classe
     */
    val (marca, modelo) = Carro("Ford", "Fusion")
    println("$marca $modelo")

    /**
     * Utilização do operador destructuring em cima de uma lista com dois elementos
     */
    val (marido, mulher) = listOf("João", "Maria")
    println("$marido e $mulher")

    /**
     * Utilização do operador destructuring em cima de uma lista com três elementos em que será
     * considerado apenas o terceiro elemento
     */
    val (_, _, terceiroLugar) = listOf("Kimi", "Hamilton", "Alonso")
    println("$terceiroLugar terminou em terceiro lugar.")
}
