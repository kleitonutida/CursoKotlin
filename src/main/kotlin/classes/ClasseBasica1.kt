package classes

/**
 * Para se declarar uma classe, é necessário utilizar a palavra "class" e logo em seguida definir
 * um nome para a classe
 *
 * O construtor de uma classe tem o mesmo nome da classe e por padrão toda a classe tem o seu
 * construtor padrão que não recebe nenhum parâmetro
 */
class Cliente {
    /**
     * Dentro de classes temos os membros, que são atributos e comportamentos
     * Os atributos são os dados
     * Os comportamentos são as funções / métodos
     */
    var nome: String = ""
}

fun main(args: Array<String>) {
    val cliente = Cliente()
    cliente.nome = "João"
    println("O cliente é ${cliente.nome}")
}
