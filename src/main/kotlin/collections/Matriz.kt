package collections

fun main(args: Array<String>) {
    /**
     * Criando um array de 3 posições e dentro de cada posição terá um array de 3 posições preenchidos
     * com valores nulos
     */
    val matriz = Array(3) { arrayOfNulls<Int>(3) }

    /**
     * Incluindo os valores em cada uma das posições do array
     */
    matriz[0][0] = 1 // matriz.get(0).set(0, 1)
    matriz[0][1] = 2
    matriz[0][2] = 3
    matriz[1][0] = 4
    matriz[1][1] = 5
    matriz[1][2] = 6
    matriz[2][0] = 7
    matriz[2][1] = 8
    matriz[2][2] = 9

    /**
     * Percorrendo o array utilizando o for com destructuring
     * Com o destructuring é possível ter acesso ao índice do array para acessar o valor de uma linha
     * e coluna específica do array, mas também é possível utilizar um array dentro de outro array
     * para recuperar o valor
     */
    for ((linha, linhaArray) in matriz.withIndex()) {
        for ((coluna, valor) in linhaArray.withIndex()) {
            println("[$linha][$coluna] - ${matriz[linha][coluna]} == $valor")
        }
    }

    /**
     * Utilizando o foreach com expressão lambda para poder acessar o valor da matriz
     * Neste caso foi feito o encadeamento de dois foreach
     */
    matriz.forEach { linha ->
        linha.forEach { valor ->
            println(valor)
        }
    }
}
