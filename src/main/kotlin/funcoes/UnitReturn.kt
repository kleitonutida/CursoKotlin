package funcoes

/*
 * No Kotlin o void do Java foi substituído pelo Unit
 * O Unit é um objeto que representa a ausência de valor, mas que possui algumas funcionalidades
 */

/**
 * Função sem declarar o retorno e sem retornar valor
 */
fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

/**
 * Função declarando o retorno "Unit" e sem retornar valor
 */
fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

/**
 * Função declarando o retorno "Unit" e retornando sem especificar um valor
 */
fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

/**
 * Função declarando o retorno "Unit" e retornando uma "Unit"
 */
fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

/**
 * Função sem declarar o retorno e retornando uma "Unit"
 */
fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMaior1(2, 1)
    imprimeMaior2(2, 1)
    imprimeMaior3(2, 1)
    imprimeMaior4(2, 1)
    /**
     * Nesta chamada, como o Unit é um objeto é possível utilizar outras funções a partir do seu retorno
     * Neste caso, está sendo chamado o "run" para validar uma condição booleana e logo em seguida
     * está sendo printado na tela o resultado da expressão a partir da palavra "this"
     */
    imprimeMaior5(2, 1).run { 2 > 1 }.run { println("Resultado = $this") }
}
