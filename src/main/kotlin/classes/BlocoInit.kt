package classes

class Filme3(nome: String, anoLancamento: Int, genero: String) {
    val nome: String
    val anoLancamento: Int
    val genero: String

    /*
     * Bloco de inicialização pode ser utilizado para inicializar variáveis mais rebuscadas quanto para realizar
     * algum cálculo.
     * Esta funcionalidade também pode ser feita através do construtor
     * O Bloco init possui acesso às variáveis do construtor
     */
    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme3(nome = "Os Incríveis", anoLancamento = 2004, genero = "Ação")
    println("A ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}.")
}