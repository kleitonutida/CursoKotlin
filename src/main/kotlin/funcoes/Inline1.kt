package funcoes

inline fun transacao(funcao: () -> Unit) {
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
}