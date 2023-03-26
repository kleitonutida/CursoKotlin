package fundamentos.operadores

/**
 * Criação de uma função que receber um valor como parâmetro e retorna o resultado da expressão if
 */
fun obterResultado(nota: Double): String = if (nota >= 7.0) "Passou" else "Reprovou"

fun main(args: Array<String>) {
    println(obterResultado(6.3))
}
