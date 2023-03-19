package fundamentos

fun main(args: Array<String>) {
    /**
     * Se atribuído um valor diferente de nulo ele será considerado
     */
    var opcional: String? = null
    val obrigatorio: String = opcional ?: "Valor Padrão" // Elvis operator

    println(obrigatorio)
}
