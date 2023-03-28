package funcoes

/*
 * O vararg quer dizer que o parâmetro não tem uma quantidade de valores definidos, ou seja,
 * pode ser informado quantos valores forem necessários.
 * No Java esta definição é feita utilizando os "..." e ele precisa ser necessariamente o último
 * argumento
 * No Kotlin não precisa ser o último, contanto, é necessário que seja um argumento nomeado ao
 * informar o parâmetro
 */
fun ordernar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for (n in ordernar(38, 3, 456, 8, 51, 1, 88, 73, a = 1)) {
        print("$n ")
    }
}
