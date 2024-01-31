package lambdas

class Caluladora2 {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }

    fun add(valor: Int) {
        resultado += valor
    }
}

fun main(args: Array<String>) {
    val calculadora = Caluladora2()

    /**
     * Utilizando o apply para chamar as funções da classe Calculadora e no final exibir o resultado
     */
    calculadora.apply { soma(4, 5) }
        .apply { add(5) }
        .apply { println(resultado) }

    /**
     * Outra forma de utilizar a função apply
     */
    calculadora.apply {
        soma(4, 5)
        add(5)
        println(resultado)
    }

    /**
     * Utilizando a inline function with
     */
    with(calculadora) {
        soma(4, 5)
        add(5)
        println(resultado)
    }
}
