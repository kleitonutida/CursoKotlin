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
    /**
     * Constante "local" disponível apenas dentro desta função
     */
    val local = "Fulano"
    println("$diretamenteNoArquivo $local")
}

/*
 * As funções, variáveis e constantes definidas em classes são associadas ao objeto
 */
class Coisa {
    var variavelDeInstancia: String = "Boa noite"

    /**
     * Companion objeto é um objeto singleton que está associado a classe e será criado apenas
     * uma única vez, ou seja, é um objeto singleton que terá apenas uma única instância
     */
    companion object {
        /**
         * Como está anotado com o @JvmStatic essa variável será gerada como uma constante estática
         * quando for gerado o bytecode. Neste caso vai fazer diferença apenas se for acessar
         * este objeto no Java
         *
         * Caso não estiver anotado com o @JvmStatic funcionaria da mesma forma, mas seria criado um
         * membro do objeto companheiro criado na classe Coisa, como se fosse um singleton
         * No fim o que estiver dentro desse bloco será criado apenas uma única instância
         *
         * Se estiver fora do companion object ocorrerá erro, pois a forma de se definir membros
         * estáticos é dentro de um companion object
         */
        @JvmStatic val contanteDeClasse = "Ciclano"
    }

    /**
     * Função de instância
     */
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