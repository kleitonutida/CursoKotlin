package fundamentos

fun main(args: Array<String>) {
    val a = 1

    /**
     * Número para String
     * Neste caos como o número foi convertido para String, o resultado será a concatenação dos valores
     */
    println(a.toString() + 1)

    /**
     * String para Número
     * Neste caso como o número foi convertido para Double, o resultado será a soma entre os valores
     * Lembrando que para casas decimais deve-se utilizar o "." ao invés da ","
     */
    println("1.9".toDouble() + 3)
    println("Teste".toIntOrNull())
    println("Teste".toIntOrNull() ?: 0)
    println("1".toInt() + 3)
}
