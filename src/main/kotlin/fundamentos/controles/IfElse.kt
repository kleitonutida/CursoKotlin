package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Double = 6.3

    /**
     * Condição para exibir a mensagem, caso contrário será exibido a outra mensagem
     *
     * Dentro de um bloco if-else, pode-se ter várias condições utilizando os operadores lógicos
     * contanto qque o resultado seja verdadeiro ou falso
     */
    if (nota >= 7.0) {
        println("Aprovado!!")
    } else {
        println("Reprovado!!")
    }
}
