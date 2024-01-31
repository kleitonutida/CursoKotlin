package fundamentos.operadores

fun main(args: Array<String>) {
    val nota: Double = 6.2

    /**
     * Utilizando o if-expression como um operador ternário.
     */
    val resultado: String = if (nota >= 7) "Aprovado" else "Reprovado"
    println(resultado)
}
