package fundamentos

fun main(args: Array<String>) {
    var opcional: String? = null // Se atribuído um valor diferente de nulo ele será considerado
    val obrigatorio: String = opcional ?: "Valor Padrão" // Elvis operator

    println(obrigatorio)
}