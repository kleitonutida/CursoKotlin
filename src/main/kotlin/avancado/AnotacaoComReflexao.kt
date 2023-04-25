package avancado

import java.util.ArrayList

/**
 * Para executar é necessário que a lib do kotlin-reflect esteja nas libs do projeto.
 * Caso ocorra erro ao executar o projeto é necessário adicioná-lo.
 * 1. Entre na estrutura do projeto
 * 2. Em Project Settings vá até Libraries
 * 3. Clique no sinal de "+" para adicionar uma nova lib e selecione "From maven"
 * 4. Na próxima tela digite o nome da lib "kotlin-reflect" e clique em pesquisar
 * 5. Selecione a versão desejada e clique em Ok para adicionar a lib
 */

/**
 * Criação de uma annotation personalizada para validar se um determinado valor inteiro é positivo
 */
annotation class Positivo

/**
 * Criação de uma annotation personalizada para validar se uma determinada String não é vazia
 */
annotation class NaoVazio

class Pessoa(id: Int, nome: String) {
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String = nome
}

/**
 * Reflection para realizar as validação dos campos
 * Essa função será genérica e irá receber um objeto e extrair o valor do mesmo por reflexão, mesmo que o atributo
 * seja privado
 */
fun getValor(objeto: Any, nomeDoAtributo: String): Any {
    /**
     * Recupera o campo que tem o nome informado
     * Mas, ao recuperar o campo ele pode estar inacessível. Se ele estiver inacessível, não será possível recuperar
     * o valor do campo
     */
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo)

    /**
     * Armazenando o valor do campo, se ele está acessível ou não
     * Ele pode ser verdadeiro ou falso
     */
    val estaAcessivel = atributo.isAccessible

    /**
     * Alterando o campo para ele ficar acessível
     */
    atributo.isAccessible = true
    /**
     * Recuperando o valor do atributo através do método get, neste caso ele está recuperando o valor do atributo
     * dentro do objeto informado
     */
    val valor = atributo.get(objeto)
    /**
     * Retornando a acessibilidade ao valor original
     */
    atributo.isAccessible = estaAcessivel

    return valor
}

fun validar(objeto: Any): List<String> {
    val msgs = ArrayList<String>()
    /**
     * Acessando a classe do objeto e para recuperar cada um dos membros da classe
     */
    objeto::class.members.forEach { member ->
        /**
         * Acessando as anotações que um determinado membro possui
         */
        member.annotations.forEach { annotation ->
            /**
             * Recuperando o valor de um determinado objeto que contém o nome do membro informado
             */
            val valor = getValor(objeto, member.name)
            /**
             * Validação das anotações que se deseja validar
             */
            when (annotation) {
                is Positivo ->
                    /**
                     * Para a anotação Positivo ele vai validar se o campo não é do tipo inteiro e se o valor for igual
                     * a zero ou negativo
                     */
                    if (valor !is Int || valor <= 0) {
                        msgs.add("O valor '$valor' não é um número positivo!")
                    }
                is NaoVazio ->
                    /**
                     * Para a anotação NaoVazio ele vai validar se o campo não é do tipo string e se o valor está em
                     * branco
                     */
                    if (valor !is String || valor.trim().isEmpty()) {
                        msgs.add("O valor '$valor' não é uma string válida!")
                    }
            }
        }
    }
    return msgs
}

fun main(args: Array<String>) {
    val obj1 = Pessoa(1, "Chico")
    println(validar(obj1))

    val obj2 = Pessoa(-1, "   ")
    println(validar(obj2))
}
