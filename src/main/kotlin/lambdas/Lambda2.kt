package lambdas

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicacao : Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    /*
     * A função calcular deverá receber como parâmetro dois valores e o tipo de operação
     * O tipo de operação será uma classe que deverá implementar a interface Operação, que
     * obrigará implementar a função executar para o tipo de operação desejado
     * Por fim, a função executar pode ser invocada para a operação informada
     */
    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    /*
     * Função calcular que deverá receber dois valores e a operação
     * A operação é uma função lambda que recebe dois parâmetros e retorna um valor inteiro
     * No corpo da função será executado a função lambada operação, que será retornada da
     * função calcular. Esta implemtação não ocorre erro, pois, os tipos dos parâmetros da função
     * calcular e da operação são os mesmo, bem como o seu retorno também é do mesmo tipo
     */
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    val resultado1 = calculadora.calcular(3, 4)
    val resultado2 = calculadora.calcular(3, 4, Multiplicacao())

    val subtracao = { a: Int, b: Int -> a - b }
    val resultado3 = calculadora.calcular(3, 4, subtracao)

    println("$resultado1 $resultado2 $resultado3")
}