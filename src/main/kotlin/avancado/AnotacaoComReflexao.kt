package avancado

import java.util.ArrayList

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
 * Essa função será genérica e irá receber um objeto e extrair o valor do mesmo por reflexão
 */
fun getValor(objeto: Any, nomeDoAtributo: String): Any {
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo)
    val estaAcessivel = atributo.isAccessible

    atributo.isAccessible = true
    val valor = atributo.get(objeto)
    atributo.isAccessible = estaAcessivel

    return valor
}

fun validar(objeto: Any): List<String> {
    val msgs = ArrayList<String>()
    objeto::class.members.forEach { member ->
        member.annotations.forEach { annotation ->
            val valor = getValor(objeto, member.name)
            when (annotation) {
                is Positivo ->
                    if (valor !is Int || valor <= 0) {
                        msgs.add("O valor '$valor' não é um número positivo!")
                    }
                is NaoVazio ->
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

    val obj2 = Pessoa(-1, "")
    println(validar(obj2))
}
