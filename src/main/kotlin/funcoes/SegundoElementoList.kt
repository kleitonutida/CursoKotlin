package funcoes

/**
 * Criando uma função de extensão para retornar o segundo elemento de uma lista, caso contrário
 * será retornado nulo
 */
fun <E> List<E>.secondOrNull(): E? = if (this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf("João", "Maria", "Pedro")
    println(list.secondOrNull())

    val listWithoutSecondElement = listOf("João")
    println(listWithoutSecondElement.secondOrNull())
}
