package fundamentos

fun main(args: Array<String>) {
    println(soma(2, 3)) // 5
    println(soma(11)) // 12
}

/*
 * Função que retorna a soma de dois valores
 * Esta função recebe dois parâmetros e retorna o resultado da soma
 * No segundo parâmetro está definido um valor por padrão, este valor será utilizado
 * caso não seja informado
 */
fun soma(
    a: Int,
    b: Int = 1,
): Int {
    return a + b
}
