package fundamentos

fun main(args: Array<String>) {
    val valor = "abc"
//    val valor: Any = 123 // Expressão para testar um valor que não é uma String

    // Valida se o valor da variável é uma String
    if (valor is String) {
        println(valor)
    }
    // Valida se o valor da variável não é uma String
    else if (valor !is String) {
        println("Não é uma String")
    }
}
