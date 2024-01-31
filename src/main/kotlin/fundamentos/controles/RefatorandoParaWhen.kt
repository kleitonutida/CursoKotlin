package fundamentos.controles

fun main(args: Array<String>) {
    val nota = -1

    /**
     * O when é uma estrutura de controle que recebe um valor para executar uma determinada condição entre
     * múltiplas condições
     *
     * Estrutura semelhando ao switch do Java
     */
    when (nota) {
        // Se for 9 ou 10
        10, 9 -> println("Fantástico")
        // Se for 7 ou 8
        8, 7 -> println("Parabéns")
        // Se for 4, 5 ou 6
        6, 5, 4 -> println("Tem como recuperar")
        // Se estiver entre 0 e 3
        in 0..3 -> println("Te vejo no próximo semestre")
        // Se não entrar em nenhuma das condições este será o padrão
        else -> println("Nota inválida")
    }
}
