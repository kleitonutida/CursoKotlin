package lambdas

fun main(args: Array<String>) {
    val listWithNulls: List<String?> = listOf("A", null, "B", null, "C", null)

    for (item in listWithNulls) {
        /**
         * O let é utilizado para executar um bloco de código em um objeto e retornar o valor
         * resultante desse bloco. O valor resultante será o resultado da expressão lambda.
         */
        item?.let {
            println(it)
        }
    }
}
