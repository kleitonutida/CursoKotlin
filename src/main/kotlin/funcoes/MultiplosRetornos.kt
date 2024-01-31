package funcoes

import java.util.*

data class Horario(val hora: Int, val minuto: Int, val segundo: Int)

fun agora(): Horario {
    /**
     * Criando uma instância para recuperar o horário atual
     */
    val agora = Calendar.getInstance()

    with(agora) {
        /**
         * Criando uma instância de Horario retornando os valores de hora, minuto e segundo separadamente
         */
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main(args: Array<String>) {
    /**
     * Utilizando o destructuring para simular múltiplos retornos
     */
    val (h, m, s) = agora()
    println("$h:$m:$s")
}
