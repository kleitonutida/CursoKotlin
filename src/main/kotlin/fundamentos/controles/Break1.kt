package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10) {
        /**
         * Condição para executar o break
         * O break ele vai incidir sobre o bloco de repetição mais próximo associado a ele
         */
        if (i == 5) {
            break
        }
        println("Atual: $i")
    }
    println("Fim!")
}
