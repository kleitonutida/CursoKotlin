package funcoes

/*
 * No Kotlin o void do Java foi substituído pelo Unit
 * O Unit é um objeto que representa a ausência de valor, mas que tem algumas funcionalidades
 */

fun imprimeMaior1(a: Int, b: Int) {
    println(Math.max(a, b))
}

fun imprimeMaior2(a: Int, b: Int): Unit {
    println(Math.max(a, b))
}

fun imprimeMaior3(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return
}

fun imprimeMaior4(a: Int, b: Int): Unit {
    println(Math.max(a, b))
    return Unit
}

fun imprimeMaior5(a: Int, b: Int) {
    println(Math.max(a, b))
    return Unit
}

fun main(args: Array<String>) {
    imprimeMaior1(2, 1)
    imprimeMaior2(2, 1)
    imprimeMaior3(2, 1)
    imprimeMaior4(2, 1)
    imprimeMaior5(2, 1).run { 2 > 1 }.run { println("Resultado = $this") }
}