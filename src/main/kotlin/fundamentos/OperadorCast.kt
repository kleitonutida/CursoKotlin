package fundamentos

fun imprimirConceito(nota: Any) {
    /**
     * Realizando o cast de forma explícita e utilizando o "?" para realizar o cast seguro
     */
    when (nota as? Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main(args: Array<String>) {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        /**
         * Chamando a função passando os valores como inteiros
         * Caso fosse chamado sem converter e na linha 7 não estivesse sendo feito o cast seguro,
         * ocorreria o erro de ClassCastException
         */
        imprimirConceito(nota.toInt())
    }
}
