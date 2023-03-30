package funcoes

/**
 * Criação de uma função que irá exibir um log
 * Os seus parâmetros serão: o nome da função como texto e uma função anônima
 */
inline fun <T> executarComLog(nomeFuncao: String, funcao: () -> T): T {
    println("Entrando no método $nomeFuncao...")
    try {
        return funcao()
    } finally {
        println("Método $nomeFuncao finalizado...")
    }
}

/**
 * Esta função foi nomeada para somar2, pois já existe uma função de mesmo nome dentro do mesmo pacote
 * As funções e as funções inline não podem ter o mesmo nome dentro do mesmo pacote
 */
fun somar2(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    /**
     * Chamando a função executarComLog passando um lambda como função anônima e não diretamente a
     * função de somar
     * A última sentença de código da função lambda é o que será retornado, já que a função
     * executarComLog retorna o mesmo tipo de função passada como parâmetro
     */
    val resultado = executarComLog("somar") {
        somar2(4, 5)
    }

    /**
     * A função pode ser chamada também desta forma
     */
//    val resultado = executarComLog("somar", {
//        somar2(4, 5)
//    })

    val resultado2 = executarComLog("somar", {
        somar2(4, 5)
    })

    /**
     * Neste caso não será possível executar a função de somar2, pois não há uma referência válida
     * para a função
     */
    val resultado3 = executarComLog("somar") { ::somar2 }

    println(resultado)
    println(resultado2)
    println(resultado3)
}
