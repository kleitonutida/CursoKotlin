package fundamentos.controles

fun main(args: Array<String>) {
    var opcao: Int = 0

    /**
     * Estrutura de repetição ideal para situações em que não se sabe a quantidade determinada
     * de repetições
     */
    while (opcao != -1) {
        /**
         * O readline é utilizado para receber um valor digitado no console
         */
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0

        println("Você escolheu a opção $opcao")
    }

    println("Até a próxima!")
}
