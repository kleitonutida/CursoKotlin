package fundamentos.controles

fun main(args: Array<String>) {
    externo@ for (i in 1..15) {
        for (j in 1..15) {
            /**
             * O break rotulado pode ser utilizado para não incidir sobre o laço de repetição mais
             * próximo e sim sobre outro laço de repetição que esteja com o rótulo
             */
            if (i == 2 && j == 9) break@externo
            println("$i $j")
        }
    }
    println("Fim!")
}
