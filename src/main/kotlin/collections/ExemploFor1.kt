package collections

fun main(args: Array<String>) {
    val alunos = arrayListOf("Amanda", "André", "Bernardo", "Carlos")

    /**
     * Imprimindo todos os alunos cadastrados na lista
     */
    for (aluno in alunos) {
        println(aluno)
    }

    /**
     * Imprimindo todos os alunos e o seu respectivo índice dentro da lista utilizando o operador
     * destructuring
     * Se fosse um Set não teria o índice e não teria a garantia da ordem
     */
    for ((indice, aluno) in alunos.withIndex()) {
        println("${indice + 1} - $aluno")
    }
}
