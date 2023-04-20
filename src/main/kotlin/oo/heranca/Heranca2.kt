package oo.heranca

open class Animal(val nome: String)

class Cachorro : Animal {
    private val altura: Double

    /**
     * Criando um construtor que chama o construtor da classe herdada (pai)
     * Quando é definido um construtor e a classe herda de uma outra classe, obrigatoriamente o
     * construtor deverá chamar o construtor da classe herdada utilizando a palavra "super"
     */
    constructor(nome: String, altura: Double) : super(nome) {
        this.altura = altura
    }

    /**
     * Criando um construtor que chama o construtor definido dentro da própria classe utilizando
     * a palavra "this"
     * Obrigatoriamente a classe herdada deverá ter o seu construtor na definição ou o construtor
     * pode ser definido em um outro construtor dentro da própria classe, mas o construtor da classe
     * herdada deverá ser chamado na cadeia
     */
    constructor(nome: String) : this(nome, 0.0)

    override fun toString(): String = "$nome tem $altura cm de altura."
}

fun main(args: Array<String>) {
    val dogAlemao = Cachorro("Spyke", 84.3)
    val yorkshire = Cachorro("Lady Di")

    println(dogAlemao)
    println(yorkshire)
}
