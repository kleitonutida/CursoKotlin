package classes

/**
 * Classe para representar uma calculadora
 */
class Calculadora {
    /**
     * Variável de instância (objeto) que será criado a cada nova instância da classe Calculadora
     */
    private var resultado = 0

    /**
     * Função que realiza a soma de valores na variável resultado e retorna a instância de Calculadora
     */
    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    /**
     * Função que realiza a multiplicação do valor na variável resultado
     * e retorna a instância de Calculadora
     */
    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    /**
     * Função que realiza a subtração do valor na variável resultado
     * e retorna a instância de Calculadora
     */
    fun subtrair(valor: Int): Calculadora {
        resultado -= valor
        return this
    }

    /**
     * Função que realiza a divisão do valor na variável resultado
     * e retorna a instância de Calculadora
     */
    fun dividir(valor: Int): Calculadora {
        resultado /= valor
        return this
    }

    /**
     * Função que limpa a variável resultado e retorna a instância de Calculadora
     */
    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    /**
     * Função que imprime o valor da variável resultado e retorna a instância de Calculadora
     */
    fun print(): Calculadora {
        println(resultado)
        return this
    }

    /**
     * Função que retorna o valor da variável resultado
     */
    fun obterResultado(): Int {
        return resultado
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    /**
     * Realizando a chamada das funções encadeando umas nas outras
     * Isso é possível, pois o retorno de algumas das funções é a própria instância de Calculadora
     */
    calculadora.somar(1, 2, 3).multiplicar(3).print()
    calculadora.somar(7, 10).print().limpar()

    println(calculadora.obterResultado())

    calculadora.somar(1, 2, 3).subtrair(2).print()
    calculadora.dividir(2).print()
}
