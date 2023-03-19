package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    /**
     * Utilizando o operador null safety para chamada de uma função
     */
    println(a?.inc())

    println("Momento do erro...")
    /**
     * Forçando a exibição de NullPointer ao chamar uma função em uma propriedade nula
     */
    println(a!!.inc())
}
