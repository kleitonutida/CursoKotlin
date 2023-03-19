package fundamentos

fun main(args: Array<String>) {
    var a: Double = 1.0
    var b = 2

    /**
     * Para atribuir o valor a uma variável declarada ela precisa ser do mesmo tipo
     * No caso, se a variável 'a' fosse igual a 1, o código abaixo ocorrerá erro, pois a atribuição de
     * valores deve ser feita para o mesmo tipo
     */
    a = 2.3

    print(a + b)
}
