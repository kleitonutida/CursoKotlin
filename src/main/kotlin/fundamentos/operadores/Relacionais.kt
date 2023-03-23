package fundamentos.operadores

import java.util.Date

fun main(args: Array<String>) {
    /**
     * Validar se dois valores são iguais
     */
    println("Banana" === "Banana")

    /**
     * Validar se dois valores são diferentes
     */
    println(3 !== 2)

    /**
     * Validar se um valor é menor que outro
     */
    println(3 < 2)

    /**
     * Validar se um valor é maior que outro
     */
    println(3 > 2)

    /**
     * Validar se um valor é menor e igual a outro
     */
    println(3 <= 2)

    /**
     * Validar se um valor é maior e igual a outro
     */
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    /**
     * Igualdade referencial é quando é validado se duas variáveis apontam para o mesmo endereço de
     * memória
     */
    println("Resultado com '===' ${d1 === d2}")

    /**
     * Igualdade estrutural é quando é verificado se os conteúdos dos objetos comparados são iguais
     */
    println("Resultado com '==' ${d1 == d2}")
    println("Resultado com '==' ${d1.equals(d2)}")
}
