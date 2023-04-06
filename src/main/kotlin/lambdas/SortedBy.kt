package lambdas

fun main(args: Array<String>) {
    val nomes = arrayListOf("Renata", "Bernardo", "Willian", "Andreia", "Caio")

    /**
     * Realiza a ordernação dos nomes por ordem alfabética
     */
    val ordenados = nomes.sortedBy { it }

    /**
     * Realiza a ordenação dos nomes por ordem alfabética invertida
     */
    val ordenadosReversed = nomes.sortedBy { it.reversed() }
//    val ordenados = nomes.sortedBy({ it })
//    val ordenados = nomes.sortedBy() { it }

    println(ordenados)
    println(ordenadosReversed)
}
