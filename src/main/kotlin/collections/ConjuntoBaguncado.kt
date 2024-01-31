package collections

/**
 * Criando uma função de extensão na claase Any para facilitar
 */
fun Any.print() = println(this)

fun main(args: Array<String>) {
    val conjunto = hashSetOf(3, 'a', "texto", true, 3.14)

    /**
     * O método get não existe para as Collections do tipo Set
     */
    // conjunto.get(1)

    /**
     * Adicionando um novo elemento
     * Este resultado será falso, pois um Set não aceita valores repetidos
     */
    conjunto.add(3).print()

    /**
     * Adicionando um novo elemento
     * Este resultado será verdadeiro, pois este valor não está contido dentro da Collection
     */
    conjunto.add(10).print()

    /**
     * Retornando a quantidade de elementos que tem dentro da Collection
     */
    conjunto.size.print()

    /**
     * Removendo um elemento da Collection
     * Este resultado será falso, pois o que contém dentro da Collection é um caractere e não uma String
     */
    conjunto.remove("a").print()

    /**
     * Removendo um elemento da Collection
     * Este resultado será verdadeiro, pois o caractere está contido dentro da Collection
     */
    conjunto.remove('a').print()

    /**
     * Verificando se um elemento contém dentro da Collection
     * Este resultado será falso, pois o elemento foi removido da Collection
     */
    conjunto.contains('a').print()

    /**
     * Verificando se um elemento contém dentro da Collection
     * Este resultado será falso, pois o elemento é diferente do que está dentro da Collection
     */
    conjunto.contains("Texto").print()

    /**
     * Verificando se um elemento contém dentro da Collection
     * Este resultado será verdadeiro, pois o elemento está contido dentro da Collection
     */
    conjunto.contains("texto").print()

    /**
     * Criando um conjunto de somente leitura, não é possível adicionar elementos nele
     */
    val nums = setOf(1, 2, 3)
    /**
     * Este método não está disponível, pois o conjunto é somente leitura
     */
    // nums.add(4)

    /**
     * Unindo dois conjuntos, o elemento 3 aparecerá apenas uma única vez, pois ele existe em ambos os conjuntos
     */
    (conjunto + nums).print()
    /**
     * Tirando todos os elementos que existem dentro do conjunto 'nums' do conjuntos 'conjunto'
     */
    (conjunto - nums).print()

    /**
     * É a intersecção entre os dois conjuntos, ou seja, exibirá apenas os elementos que existem em ambos os conjuntos
     * Neste caso, ele não muda o conjunto original
     */
    conjunto.intersect(nums).print() // Não muda o conjunto
    conjunto.retainAll(nums) // Muda o conjunto
    conjunto.print()

    /**
     * Limpar o conjunto
     */
    conjunto.clear()

    /**
     * Verificar se o conjunto está vazio
     */
    conjunto.isEmpty().print()
}
