package classes

/**
 * Os parâmetros informados após o nome da classe, serão utilizados para determinar o construtor da
 * classe. Neste construtor é possível utilizar os parâmetros nomeados e também informar um
 * valor padrão para cada uma das variáveis
 */
class Filme2(var nome: String, val anoLancamento: Int, val genero: String)

fun main(args: Array<String>) {
    val filme = Filme2(nome = "Monstros S.A", anoLancamento = 2001, genero = "Animação")
    filme.nome = "Universidade Monstros"
    println("A ${filme.genero} ${filme.nome} foi lançada em ${filme.anoLancamento}.")
}
