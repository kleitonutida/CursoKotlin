package fundamentos.operadores

fun main(args: Array<String>) {
    var num1: Int = 1
    var num2: Int = 1

    /**
     * Adiciona 1 ao valor da variável, ou seja, está alterando o valor da variável e neste caso
     * não poderia ser uma constante.
     */
    num1++
    println(num1)
    /**
     * Diminui 1 ao valor da variável, ou seja, está alterando o valor da variável e neste caso
     * não poderia ser uma constante.
     */
    --num1
    println(num1)

    // Incremento e decremento
    /**
     * PRÉ-FIXADO
     * Os operadores pré-fixados (++num1) terão precedência em relação à comparação, ou seja,
     * será feito a execução do mesmo e depois será feito a comparação
     *
     * PÓS-FIXADO
     * Os operadores pós-fixados (num2--) terão uma precedência menor em relação à comparação, ou seja,
     * a comparação será feita antes do decremento da variável
     */
    println(++num1 == num2--)
    println(num1 == num2)
}
