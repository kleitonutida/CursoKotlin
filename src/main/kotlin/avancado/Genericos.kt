package avancado

import java.util.ArrayList

/**
 * Criando um objeto que recebe um tipo genérico
 */
class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>()

    init {
        /**
         * Na instânciação do objeto, o objeto será adicionado a lista
         */
        adicionar(objeto)
    }

    /**
     * Método responsável por adicionar um novo objeto a instância de caixa
     */
    fun adicionar(novoObjeto: T) {
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main(args: Array<String>) {
    /**
     * Criando uma nova instância e adicionando o objeto do tipo String dentro dela
     * A partir deste momento será inferido automaticamente o tipo String para o objeto
     */
    val materialEscolar = Caixa("Caneta")
    materialEscolar.adicionar("Lápis")
    materialEscolar.adicionar("Borracha")
    println(materialEscolar)

    /**
     * Criando uma nova instância e adicionando o objeto do tipo Int dentro dela
     * A partir deste momento será inferido automaticamente o tipo Int para o objeto
     */
    val numeros = Caixa(objeto = 1)
    numeros.adicionar(3)
    println(numeros)
}
