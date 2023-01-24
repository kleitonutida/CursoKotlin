package classes
/*
 * Variáveis de classe são variáveis compartilhadas por todos os objetos e tem apenas um único valor
 * compartilhado entre eles
 *
 * Variaveis de instância são variáveis que pertencem ao objeto, ou seja, cada objeto criado terá uma
 * cópia que poderá ser mexido de forma independente em cada um dos objetos
 */

/*
 * As variáveis e funções top level são membros estáticos dentro do Kotlin
 */
val diretamenteNoArquivo = "Bom dia"

fun topLevel() {
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}

/*
 * As funções, variáveis e constantes definidas em classes são associadas ao objeto
 */
class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    companion object {
        /*
         * Como está anotado com o @JvmStatic essa variável será gerada como uma constante estática
         * Neste caso vai fazer diferença apenas se for acessar este objeto no Java
         *
         * Caso não estive anotado com o @JvmStatic funcionaria da mesma forma, mas seria criado um
         * membro do objeto companheiro criado na classe Coisa, como se fosse um singleton
         * No fim o que estiver dentro desse bloco será criado apenas uma única instância
         */
        @JvmStatic val contanteDeClasse = "Ciclano"
    }

    fun fazer() {
        val local: Int = 7

        if (local > 3) {
            val variavelDeBloco = "Beltrano"
            println("$variavelDeInstancia, $contanteDeClasse, $local e $variavelDeBloco")
        }
    }
}

fun main(args: Array<String>) {
    topLevel()
    Coisa().fazer()
    println(Coisa.contanteDeClasse)
}