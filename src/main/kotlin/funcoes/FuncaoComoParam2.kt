package funcoes

/**
 * Função genérica que realiza o filtro de acordo com a função recebida como parâmetro
 * Este filtro deverá receber um valor genérico e retornar um valor booleano
 */
fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for (e in lista) {
        if (filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

/**
 * Função que filtra as palavras que tem três letras
 */
fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

/**
 * Função que filtra as palavras que tem cinco letras
 */
fun comCincoLetras(nome: String): Boolean {
    return nome.length == 5
}

/**
 * Função que filtra os números maiores que vinte
 */
fun maioresQueVinte(numero: Int): Boolean = numero > 20

fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
    println(filtrar(nomes, ::comCincoLetras))

    val numeros = listOf(1, 67, 234, 21, 2, 456, 7, 10).sorted()
    println(filtrar(numeros, ::maioresQueVinte))
}
