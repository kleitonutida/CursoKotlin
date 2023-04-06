package lambdas

fun main(args: Array<String>) {
    /**
     * A função lambda é uma função anônima delimitada pelas chaves ({})
     * O que estiver dentro das chaves é o que vai ser executado dentro da função lambda
     * Implicitamente a última sentença de código será retornado, sendo que não é necessário informar
     * o tipo de retorno, ele será inferido de acordo com o retorno
     * O que vem à esquerda da seta (->) serão os parâmetros definidos na função e o que estiver à
     * direita será o corpo da função
     */
    val soma = { x: Int, y: Int -> x + y }
    println(soma(4, 6))
}
