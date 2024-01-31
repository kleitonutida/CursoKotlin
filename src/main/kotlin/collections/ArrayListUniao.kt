package collections

fun main(args: Array<String>) {
    val numeros = arrayListOf(1, 2, 3, 4, 5)
    val strings = arrayListOf("Rafael", "Pedro", "Leandro", "Gustavo")

    /**
     * Realizando a união de duas listas através da sobrecarga de operadores
     * Neste caso o operador "+" irá juntar as duas listas
     */
    val uniao = numeros + strings // sobrecarga de operadores

    for (item in uniao) {
        println(item)
    }
}
