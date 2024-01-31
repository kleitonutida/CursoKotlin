package collections

fun main(args: Array<String>) {
    /**
     * Cria um array de tamanho definido e inclui os elementos a partir de uma expressão
     */
    val numeros = Array<Int>(10) { i -> i * 10 }

    for (numero in numeros) {
        println(numero)
    }

    /**
     * Retorna o valor do array na posição informada, lembrando que a primeira posição do array é o 0
     * Além do "numeros.get(1)", pode ser utilizado o "numeros[1]"
     */
    println(numeros.get(1))
    /**
     * Retorna o tamanho do array
     */
    println(numeros.size)

    /**
     * Altera o valor do array em uma determinada posição
     * Além do "numeros.set(1, 1234)", pode ser utilizado o "numeros[1] = 1234"
     */
    numeros.set(1, 1234)
    println(numeros[1])

    numeros[1] = 1234
    println(numeros[1])
}
