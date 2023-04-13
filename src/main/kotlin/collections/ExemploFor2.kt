package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")
    /**
     * Utilizando uma expressão lambda em conjunto com o foreach para passar pelos elementos da lista
     * e exibir eles no console
     */
    alunos.forEach { println(it) }
}
