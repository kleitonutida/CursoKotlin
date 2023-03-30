package funcoes

/**
 * Funções inline são funções que são compiladas diretamente no local que é realizado a chamada dela.
 * Com isso, pode melhorar a eficiência do código em tempo de execução com a redução do número de chamadas
 * de função e principalmente no reaproveitamento de um determinado trecho de código que não precisa ser
 * repetido várias vezes
 */
inline fun transacao(funcao: () -> Unit) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}

inline fun transacao1(a: Int, funcao: () -> Unit) {
    println("Abrindo transação...")
    try {
        funcao()
    } finally {
        println("Fechando transação")
    }
}

fun main(args: Array<String>) {
    transacao {
        println("Executantdo SQL 1...")
        println("Executantdo SQL 2...")
        println("Executantdo SQL 3...")
    }

    /**
     * Chamando a função, passando o conjunto de funções como parâmetro diretamente entre os
     * parênteses
     */
    transacao({
        println("Executantdo SQL 1...")
        println("Executantdo SQL 2...")
        println("Executantdo SQL 3...")
    })

    /**
     * Chamando a função com mais de um parâmetro, onde a função é passada fora dos parênteses
     * Obs.: Desta forma só irá funcionar se a função for o último parâmetro
     */
    transacao1(a = 1) {
        println("Executantdo SQL 1...")
        println("Executantdo SQL 2...")
        println("Executantdo SQL 3...")
    }

    /**
     * Chamando a função com mais de um parâmetro, passando a função dentro dos parênteses
     */
    transacao1(a = 1, {
        println("Executantdo SQL 1...")
        println("Executantdo SQL 2...")
        println("Executantdo SQL 3...")
    })
}
