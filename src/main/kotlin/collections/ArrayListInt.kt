package collections

fun main(args: Array<String>) {
    /**
     * Cria uma lista de valores pares
     */
    val pares = arrayListOf(2, 4, 6)

    /**
     * Cria um array de valores impares a partir da função intArrayOf
     */
    val impares = intArrayOf(1, 3, 5)

    /**
     * Realiza a união da lista de elementos ímpares e pares e depois realiza a ordenação padrão dos
     * elementos
     */
    for (n in impares.union(pares).sorted()) {
        print("$n ")
    }
}
