package fundamentos.operadores

fun main(args: Array<String>) {
    var a: Int = 7
    var b: Int = 3

    /**
     * Operação de soma de um valor
     * É o mesmo que b = b + a
     */
    b += a

    /**
     * Operação de subtração de um valor
     * É o mesmo que b = b - 4
     */
    b -= 4

    /**
     * Operação de multiplicação de um valor
     * É o mesmo que b = b * 2
     */
    b *= 2

    /**
     * Operação de subtração de um valor
     * É o mesmo que b = b / 2
     */
    b /= 2

    /**
     * Operação de resto da divisão de um valor
     * É o mesmo que b = b % 2
     */
    b %= 2

    println(b)
}
