package oo.encapsulamento

/**
 * Constantes top level só três tipos de acessos disponíveis
 */
private val dentroDoArquivo = 1

// protected val protegidoNaoSuportadoAqui = 1
internal val dentroDoProjeto = 1
public val publico = 1

/**
 * Funções top level só três tipos de acessos disponíveis
 */
private fun dentroDoArquivo() = 1

// protected fun protegidoNaoSuportadoAqui() = 1
internal fun dentroDoProjeto() = 1
public fun publico() = 1

/**
 * Quando uma classe está marcada como "open" quer dizer que ele vai estar disponível para ser herdada
 * Por padrão, se não tiver a palavra "open", ela não vai permitir herança
 */
open class Capsula {
    /**
     * Definindo os atributos e seus modificadores de acesso
     */
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    val publico = 1

    /**
     * Definindo as funções e seus modificadores de acesso
     */
    private fun dentroDoObjeto() = 1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    fun publico() = 1
}

class CapsulaFilha : Capsula() {
    fun verificarAcesso() {
        /**
         * Verificando os acessos dos atributos e das funções
         * Os tipos privados não são possíveis acessar na herança
         * Já os tipos protected, internal e public podem ser acessados após herdar
         * No caso do protected ele pode ser acessado diretamente sem instanciar
         * O internal vai ser possível acessar apenas quando estiver dentro do mesmo projeto, se for
         * feito a exportação não será possível acessar em quem estiver importando
         * Já o public tem acesso de qualquer lugar
         * Na herança, as funções tem o mesmo comportamento que os atributos
         */
//        println(Capsula().dentroDoObjeto)
//        println(Capsula().vaiPorHeranca)
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)
    }
}

fun verificarAcesso() {
    /**
     * Verificando o acesso a partir da instanciação da classe
     * Os tipos private e protected não é possível acessar a partir de uma nova instância
     * O internal vai estar disponível apenas no mesmo projeto, se for importado em um outro projeto,
     * o mesmo não vai ter acesso
     * Já o public tem acesso de qualquer lugar
     */
//    println(Capsula().dentroDoObjeto())
//    println(Capsula().vaiPorHeranca())
    println(Capsula().dentroDoProjeto())
    println(Capsula().publico())
}
