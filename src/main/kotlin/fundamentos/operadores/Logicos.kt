package fundamentos.operadores

fun main(args: Array<String>) {
    val executouTrabalho1: Boolean = false
    val executouTrabalho2: Boolean = false

    /**
     * Operador OU (||) para verificar se será comprado o sorverte
     *
     * | OPERANDO 1 | OPERANDO 2 | RESULTADO  |
     * | VERDADEIRO | VERDADEIRO | VERDADEIRO |
     * | VERDADEIRO | FALSO      | VERDADEIRO |
     * | FALSO      | VERDADEIRO | VERDADEIRO |
     * | FALSO      | FALSO      | FALSO      |
     */
    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2

    /**
     * Operador AND (&&) para verificar se será comprado a TV de 50'
     *
     * | OPERANDO 1 | OPERANDO 2 | RESULTADO  |
     * | VERDADEIRO | VERDADEIRO | VERDADEIRO |
     * | VERDADEIRO | FALSO      | FALSO      |
     * | FALSO      | VERDADEIRO | FALSO      |
     * | FALSO      | FALSO      | FALSO      |
     */
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2

    /**
     * Operador XOR (xor) para verificar se será comprado a TV de 32'
     * Este é o operador "ou exclusivo". Ele é um operador lógico que retorna verdadeiro se e somente
     * se os operandos têm valores booleanos diferentes
     *
     * | OPERANDO 1 | OPERANDO 2 | RESULTADO  |
     * | VERDADEIRO | VERDADEIRO | FALSO      |
     * | VERDADEIRO | FALSO      | VERDADEIRO |
     * | FALSO      | VERDADEIRO | VERDADEIRO |
     * | FALSO      | FALSO      | FALSO      |
     */
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)

    /**
     * Operador unário
     * Este é o operador de negação, que retorna o inverso lógico de uma expressão booleana
     */
    if (!comprouSorvete) {
        println("A saúde agradece.")
    }
}
