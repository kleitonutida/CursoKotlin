package lambdas

data class Aluno(val nome: String, val nota: Double)

fun main(args: Array<String>) {
    /**
     * Criando uma lista de alunos. A partir desta lista será feito o filtro dos alunos que tiveram
     * nota maior que 7 e depois será ordenado por nome.
     */
    val alunos = arrayListOf(
        Aluno(nome = "Pedro", nota = 7.4),
        Aluno(nome = "Artur", nota = 8.0),
        Aluno(nome = "Rafael", nota = 9.7),
        Aluno(nome = "Ricardo", nota = 5.7),
    )

    /**
     * O trecho de código "it.nota" ou "it.nome" pode ser substituído por "aluno: Aluno -> aluno.nota"
     * ou "aluno: Aluno -> aluno.nome", o que deixa mais claro que está validado cada aluno para
     * realizar o filtro ou a ordenação
     */
    val aprovados = alunos
        .filter { it.nota >= 7.0 }
        .sortedBy { it.nome }

    println(aprovados)
}
