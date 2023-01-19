package funcoes

fun <E> filtrar(lista: List<E>, filtro: (E) -> Boolean): List<E> {
    val listaFiltrada = ArrayList<E>()
    for (e in lista) {
        if (filtro(e)) {
            listaFiltrada.add(e)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun comCincoLetras(nome: String): Boolean {
    return nome.length == 5
}

fun maioresQueVinte(numero: Int): Boolean = numero > 20

fun main(args: Array<String>) {
    val nomes = listOf("Ana", "Pedro", "Bia", "Gui", "Rebeca")
    println(filtrar(nomes, ::comTresLetras))
    println(filtrar(nomes, ::comCincoLetras))

    val numeros = listOf(1, 67, 234, 21, 2, 456, 7, 10).sorted()
    println(filtrar(numeros, ::maioresQueVinte))
}
