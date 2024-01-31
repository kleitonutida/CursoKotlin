package avancado

data class Ponto(val x: Int, val y: Int) {
    /**
     * A palavra "operator" é utilizada juntamente com a palavra "fun" para dizer que está sendo feita
     * a sobrecarga de um operador
     * Esta função vai receber um objeto do tipo Ponto e somar com o objeto atual e retornar um novo
     * objeto do tipo Ponto
     */
    operator fun plus(other: Ponto): Ponto = Ponto(x + other.x, y + other.y)

    operator fun unaryMinus(): Ponto = Ponto(-x, -y)
}

fun main(args: Array<String>) {
    val ponto1 = Ponto(10, 20)
    val ponto2 = Ponto(10, 20)

    println(-ponto1)
    println(ponto1 + ponto2)
}
