package funcoes

// Todos os parâmetros de uma função são imutáveis
fun incremento(num: Int) {
    num++ // num = num + 1
}

fun main(args: Array<String>) {
    incremento(3)
}