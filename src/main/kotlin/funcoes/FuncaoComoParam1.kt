package funcoes

class Operacoes {
    fun somar(a: Int, b: Int): Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int {
    return a + b
}

/**
 * Função que receber três argumentos
 * Os argumentos "a" e "b" são do tipo Int
 * A "funcao" é uma função que espera receber dois argumentos do tipo Int e retornar um valor Int,
 * ou seja, o parâmetro recebido deve ser uma função que tenha dois argumentos do tipo Int e um retorno
 * do tipo Int
 *
 * Esta função é um função de ordem superior que recebe como parâmetro um função que será executada com
 * os valores de "a" e "b" e retorna um resultado. Isso permite que o comportamento da função possa ser
 * alterado dinamicamente, dependendo da função passada como parâmetro.
 */
fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main(args: Array<String>) {
    /**
     * Chamando a função "calc" passando a referência da função somar da classe
     * Operacoes através do operador "::". Para isso é necessário instanciar a classe
     */
    println(calc(2, 3, Operacoes()::somar))
    /**
     * Chamando a função "calc" passando a referência da função top-level somar através do operador "::"
     * A função somar está sem os parênteses "()" porque está sendo passado a referência da função, quem
     * está invocando a função somar é a função "calc" que recebe a função como parâmetro
     */
    println(calc(2, 3, ::somar))
}
