package funcoes

/**
 * Função top-level para retornar o menor valor entre duas variáveis
 */
fun min(a: Int, b: Int): Int = if (a < b) a else b

/**
 * A Função também pode ser declarada com um corpo e retornando o valor nele
 */
// fun min(a: Int, b: Int): Int {
//    return if (a < b) a else b
// }

fun main(args: Array<String>) {
    print("O menor valor é ${min(3, 4)}")
}
