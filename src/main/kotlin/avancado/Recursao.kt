package avancado

/**
 * Criação de uma função recursiva que calculará o fatorial de um número
 * Se o valor for 0 ou 1 será retornado 1
 * Se o valor for acima de 2 será calculado o fatorial pela multiplicação do número pelo número menos 1
 * E se for negativo será retornado uma exceção
 */
fun fatorial(num: Int): Int = when (num) {
    in 0..1 -> 1
    in 2..Int.MAX_VALUE -> num * fatorial(num - 1)
    else -> throw IllegalArgumentException("Número negativo")
}

fun main(args: Array<String>) {
    println("Resultado: ${fatorial(5)}")
}
