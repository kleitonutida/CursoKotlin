package fundamentos.controles

fun main(args: Array<String>) {
    val nota: Int = 11

    /**
     * Usando operador range em conjunto com o operador in para verificar se um valor está dentro de um
     * intervalo
     * Se o valor for, por exemplo, 8.3 ele irá entrar na segunda condição, pois ele irá truncar o valor,
     * pois a comparação está sendo realizada com um valor inteiro
     */
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
    println(5 in 7 downTo 4)
}
