package fundamentos

fun main(args: Array<String>) {
    val aprovados = listOf("João", "Maria", "Pedro") // Lista com 3 elementos

    /**
     * Impressão de um texto com a substituição do valor que está dentro de '${}'
     */
    print("O primeiro colocado foi ${aprovados[0]}.")

    /**
     * Ao invés de utilizar o template string, pode ser utilizado a concatenação de strings.
     */
    print("O primeiro colocado foi" + aprovados[0] + ".")
}
