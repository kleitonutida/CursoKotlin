package classes

class Filme {
    /**
     * Ao definir constantes, elas precisam ser inicilizadas, caso contrário ocorrerá erro de
     * compilação do código
     */
    val nome: String
    val anoLancamento: Int
    val genero: String

    /**
     * O construtor em Kotlin não segue o padrão de nomenclatura de mesmo nome da classe
     * Para se criar um construtor é necessário incluir a palavra "constructor"
     * O construtor é o responsável pela criação do objeto informando as variáveis ou constantes
     * necessárias para se criar uma instância de um objeto
     * Neste caso, pode ser informados também o parâmetro padrão de cada um dos atributos.
     */
    constructor(nome: String, anoLancamento: Int, genero: String) {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main(args: Array<String>) {
    val filme = Filme(nome = "O Poderoso Chefão", anoLancamento = 1972, genero = "Drama")
    println("O ${filme.genero} ${filme.nome} foi lançado em ${filme.anoLancamento}")
}
