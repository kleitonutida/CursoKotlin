package fundamentos

/**
 * A notação ponto é utilizada para acessar funções membros de um objeto, instância ou classe.
 */
fun main(args: Array<String>) {
    // 33.dec() é equivalente a 33 - 1 (notação ponto utilizada para acessar a função dec() de Int)
    val a: Int = 33.dec()

    // a.toString() é equivalente a a.toString(a) (notação ponto utilizada para acessar a função toString() de Int)
    val b: String = a.toString()

    println("Int: $a") // Não é necessário utilizar a delimitação de chaves para acessar a variável a

    // A notação ponto também pode ser utilizada dentro de template strings
    println("Primeiro char da String b é: ${b.first()}") // Primeiro char da String b é: 3
}
