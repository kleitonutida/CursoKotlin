package fundamentos

fun main(args: Array<String>) {
    /**
     * No momento de declaração da variável, ela deve inicializada ou tipada para ser possível
     * inferir o tipo da varável.
     *
     * Somente da forma a seguir ocorerá erro de compilação
     * var a
     */
    var a: Int
    var b = 2

    a = 10

    print(a + b)
}
