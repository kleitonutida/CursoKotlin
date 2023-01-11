package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Int = 11

    // Usando operador range
    if (nota in 9..10) {
        println("Fantástico")
    } else if (nota in 7..8) {
        println("Parabéns")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }

    // O operador range sempre é do menor para o maior
    println(5 in 7..4)
    println(5 in 4..7)
}