package fundamentos

/**
 * Pode ser utilizado um alias com a palavra 'as' para determinar um outro nome para a função
 */
import fundamentos.pacoteA.simplesFuncao as funcaoSimples
import fundamentos.pacoteA.Coisa
import fundamentos.pacoteA.FaceMoeda.CARA
import fundamentos.pacoteB.*

fun main(args: Array<String>) {
    /**
     * Importando uma função de um pacote padrão do Kotlin
     * Não há a necessiade de deixar explícito ou de realizar o import para estes pacotes
     */
    kotlin.io.println(funcaoSimples("OK"))

    val coisa = Coisa("Bola")
    println(coisa.nome)

    println(CARA)

    println("${soma(2, 3)} ${subtracao(4, 6)}")
}
