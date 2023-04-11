package collections

fun main(args: Array<String>) {
    /**
     * Criando uma lista heterogênea com possibilidade de inclusão de variados tipos de variáveis
     */
    val listaMix = arrayListOf("Rafael", true, 1, 3.14, 'p')

    for (item in listaMix) {
        if (item is String) {
            println(item.uppercase())
        } else {
            println(item)
        }
    }
}
