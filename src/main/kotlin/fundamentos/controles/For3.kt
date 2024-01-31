package fundamentos.controles

fun main(args: Array<String>) {
    /**
     * Execução de um número determinado de repetições de forma crescente e de 5 em 5
     */
    for (i in 0..100 step 5) {
        println(i)
    }

    /**
     * Execução de um número determinado de repetições de forma decrescente e de 5 em 5
     */
    for (i in 100 downTo 0 step 5) {
        println(i)
    }
}
