package classes

class Calculadora {
    private var resultado = 0

    fun somar(vararg valores: Int): Calculadora {
        valores.forEach { resultado += it }
        return this
    }

    fun multiplicar(valor: Int): Calculadora {
        resultado *= valor
        return this
    }

    fun subtrair(valor: Int): Calculadora {
        resultado -= valor
        return this
    }

    fun dividir(valor: Int): Calculadora {
        resultado /= valor
        return this
    }

    fun limpar(): Calculadora {
        resultado = 0
        return this
    }

    fun print(): Calculadora {
        println(resultado)
        return this
    }

    fun obterResultado(): Int {
        return resultado
    }
}

fun main(args: Array<String>) {
    val calculadora = Calculadora()
    calculadora.somar(1, 2, 3).multiplicar(3).print()
    calculadora.somar(7, 10).print().limpar()

    println(calculadora.obterResultado())

    calculadora.somar(1, 2, 3).subtrair(2).print()
    calculadora.dividir(2).print()
}