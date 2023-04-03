package classes

class Geladeira(val marca: String, val litros: Int)
data class Televisao(val marca: String, val polegadas: Int)

fun main(args: Array<String>) {
    val g1 = Geladeira("Brastemp", 320)
    val g2 = Geladeira("Brastemp", 320)

    /**
     * Comparação utilizando o equals padrão do objeto. Neste caso, o resultado será falso, pois
     * não é realizado a comparação de cada um dos atributos da classe Geladeira
     * Se for comparar o endereço de memória, utilizar o "==="
     * Resultado: false
     */
    println(g1 == g2)

    val tv1 = Televisao("Samsung", 32)
    val tv2 = Televisao("Samsung", 32)

    /**
     * O Data Class implementa o equals fazendo com que ele compare todos os atributos do objeto
     * Resultado: true
     */
    println(tv1 == tv2) // equals

    /**
     * Comparação da referência do endereço de memória
     * Resultado: false
     */
    println(tv1 === tv2)

    /**
     * O Data Class implementa o toString() para que retorne os valores de cada atributo
     */
    println(tv1.toString())

    /**
     * Realiza a cópia do objeto para uma nova instância
     * Este tipo de funcionalidade é muito forte na programação funcional, onde se
     * trabalha fortemente com o conceito de dados imutáveis.
     * Neste caso, o copy cria uma cópia do objeto original sem alterar os dados do mesmo e tendo a
     * possibilidade de se alterar o que se deseja
     */
    println(tv1.copy())

    /**
     * É possível gerar uma nova instância de um objeto e mesmo assim informar quais os atributos que
     * serão diferentes, sem mexer na referência original
     */
    println(tv1.copy(polegadas = 42))

    /**
     * Destructuring em data class
     */
    val (marca, pol) = tv1
    println("$marca $pol'")
}
