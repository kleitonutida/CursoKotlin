package fundamentos.controles

fun main(args: Array<String>) {
    val num1: Int = 7
    val num2: Int = 3

    /**
     * O if pode ser utilizado como expressão, mas o retorno será a última sentença de código dentro do bloco
     * Dentro do bloco também é possível colocar uma lógica, respeitando o retorno da sentença
     */
    val maiorValor = if (num1 > num2) {
        println("processando if...")
        num1
    } else {
        println("processando else...")
        num2
    }

    /**
     * Forma resumida de se utilizar o if como expressão.
     * Neste caso, não é possível ter um bloco de código para incluir uma lógica
     */
//    val maiorValor = if (num1 > num2) num1 else num2

    println("O maior valor é $maiorValor.")
}
