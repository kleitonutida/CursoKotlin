package lambdas

fun main(args: Array<String>) {
    val alunos = arrayListOf("Pedro", "Tiago", "Jonas")
    /**
     * Transformação de uma lista de alunos em uma lista de alunos com os caracteres em maiúsculo
     */
    alunos.map { it.uppercase() }
        .apply { println(this) }
}
