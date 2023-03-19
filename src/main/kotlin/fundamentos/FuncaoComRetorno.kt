package fundamentos

fun main(args: Array<String>) {
    println(soma(2, 3))
    println(soma(11))
}

/*
 * Função que retorna a soma de dois valores
 * Esta função recebe dois parâmetros e retorna o resultado da soma
 * No segundo parâmetro está definido um valor por padrão, este valor será utilizado
 * caos não seja informado ao invocar a função
 */
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}
