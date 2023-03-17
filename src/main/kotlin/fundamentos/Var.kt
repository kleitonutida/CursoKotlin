package fundamentos

/**
 * O Kotlin é uma linguagem fortemente tipada, ou seja, ao iniciar ela possui um tipo definido
 */
fun main(args: Array<String>) {
    var a: Int // Variável 'a' do tipo inteiro sem atribuição de valor

    /**
     * Tipo inferido, ou seja, apesar de não estar explícito o tipo da variável,
     * o Kotlin faz a inferência do tipo a partir do valor atribuído
     */
    var b = 2

    a = 10

    print(a + b)
}
