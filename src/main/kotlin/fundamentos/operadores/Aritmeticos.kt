package fundamentos.operadores

fun main(args: Array<String>) {
    /**
     * Desestrturando a lista em 4 variáveis
     */
    val (v1, v2, v3, v4) = listOf(3, 5, 1, 15)

    /**
     * Soma entre mais de dois ou mais valores
     */
    val soma = v1 + v2 + v3 + v4

    /**
     * Subtração de dois valores
     */
    val subtracao = v4 - v2

    /**
     * Divisão entre dois valores
     */
    val divisao = v4 / v1

    /**
     * Multiplicação de dois valores
     */
    val multiplicacao = v1 * v2

    /**
     * Resto da divisão de um valor
     */
    val modulo = v1 % 2

    println("$soma $subtracao $divisao $multiplicacao $modulo")
}
