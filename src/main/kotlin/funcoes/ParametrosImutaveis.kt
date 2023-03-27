package funcoes

/**
 * Todos os parâmetros de uma função são imutáveis, ou seja, todos os parâmetros são constantes
 * Isso quer dizer que não pode ser alterado a referência dos parâmetros, mas os valores de um objeto
 * podem ser alterados
 */
fun incremento(num: Int) {
//    num++ // num = num + 1
}

fun main(args: Array<String>) {
    incremento(3)
}
