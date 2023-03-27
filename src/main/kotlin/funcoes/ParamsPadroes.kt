package funcoes

/**
 * Criação de uma função com valores padrões
 * Ao chamar a função, se os valores não forem informados, será utilizado o valor padrão
 */
fun potencia(base: Int = 2, expoente: Int = 1): Int {
    return Math.pow(base.toDouble(), expoente.toDouble()).toInt()
}

fun main(args: Array<String>) {
    /**
     * Informando os valores sem utilizar o valor padrão
     */
    println(potencia(2, 3))
    /**
     * Informando apenas o valor da base para calculo
     */
    println(potencia(10))
    /**
     * Informando o valor da base como parâmetro nomeados para realizar o calculo
     */
    println(potencia(base = 10))
    /**
     * Informando o valor dop expoente como parâmetro nomeados para realizar o calculo
     */
    println(potencia(expoente = 8))
}
