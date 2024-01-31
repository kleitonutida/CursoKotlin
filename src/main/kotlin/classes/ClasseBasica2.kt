package classes

/**
 * Definindo o contrutor da classe que recebe uma variável como parâmetro
 * Após instanciar a classe, o atributo nome estará visível para leitura e escrita
 */
class Pessoa1(var nome: String)

/**
 * Definindo o contrutor da classe que recebe uma constante como parâmetro
 * Após instanciar a classe, o atributo nome estará visível apenas para leitura
 */
class Pessoa2(val nome: String)

/**
 * Definindo o construtor da classe que recebe um parâmetro sem definição de variável ou constante
 * Após instanciar a classe, o atributo nome não estará visível, ele é uma variável local
 * A variável vai estar disponível internamente no construtor e no processo de inicialização do objeto,
 * ele não é um atributo de instância que fica disponível quando um objeto é criado
 */
class Pessoa3(nomeInicial: String) {
    // Variável criada para disponibilizar o nome
    val nome: String = nomeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3(nomeInicial = "Pedro")
    println("${p2.nome} e ${p3.nome} são legais!")
}
