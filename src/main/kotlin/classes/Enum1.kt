package classes

/**
 * Criando uma enumeração para representar os dias da semana
 * Por convenção, as enumerações são criadas em letra maiúscula.
 */
enum class DiaSemana {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

fun main(args: Array<String>) {
    print("O melhor dia da semana é ${DiaSemana.SABADO}.")
}
