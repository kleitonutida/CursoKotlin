package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10) {
        /**
         * O continue faz com que vá para o próximo valor do laço de repetição interrompendo a execução
         * do valor atual
         */
        if (i == 5) {
            continue
        }
        println("Atual: $i")
    }
    println("Fim!")
}
