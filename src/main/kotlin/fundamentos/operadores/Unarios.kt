package fundamentos.operadores

fun main(args: Array<String>) {
    var num1: Int = 1
    var num2: Int = 1

    num1++
    println(num1)
    --num1
    println(num1)

    // Incremento e decremento
    /*
     * PÓS-FIXADOS
     * Os operadores pré-fixados (++num1) terão precedência em relação à com0paração, ou seja,
     * será feito a execução do mesmo e depois será feito a comparação
     *
     * PRÉ-FIXADOS
     * Os operadores pós-fixados (num2--) terão uma precedência menor em relação à comparação, ou seja,
     * a comparação será feita antes do decremento da variável
     */
    println(++num1 == num2--)
    println(num1 == num2)


}