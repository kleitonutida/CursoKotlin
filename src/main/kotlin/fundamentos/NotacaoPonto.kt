package fundamentos

/**
 * A notação ponto é utilizada para acessar funções membros de um objeto, instância ou classe.
 */
fun main(args: Array<String>) {
    val a: Int = 33.dec()
    val b: String = a.toString()

    println("Int: $a")

    /**
     * A notação ponto também pode ser utilizada dentro de template strings
     */
    println("Primeiro char da String b é: ${b.first()}")
}
