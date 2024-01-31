package oo.polimorfismo

/**
 * Criando uma classe genérica do tipo Comida
 * Essa classe está marcada como "open", pois por padrão, em Kotlin todas as classe são final e para
 * que seja possível herdá-las, elas precisam estar marcadas como "open"
 */
open class Comida(val peso: Double)

/**
 * Atributo "peso" definido como atributo local, pois a sua definição já está na classe Comida que
 * declara o peso em seu construtor
 */
class Feijao(peso: Double) : Comida(peso)
class Arroz(peso: Double) : Comida(peso)
class Ovo(peso: Double) : Comida(peso)

class Pessoa(var peso: Double) {
    fun comer(comida: Comida) {
        peso += comida.peso
    }
}

fun main(args: Array<String>) {
    val feijao = Feijao(0.3)
    val arroz = Arroz(0.3)
    val ovo = Ovo(0.2)

    val joao = Pessoa(80.5)
    joao.comer(feijao)
    joao.comer(arroz)
    joao.comer(ovo)

    println(joao.peso)
}
