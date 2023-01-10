package fundamentos

fun main(args: Array<String>) {
    var a: Int? = null
    println(a?.inc()) // Utilizando o operador null safety para chamada de uma função

    println("Momento do erro...")
    println(a!!.inc()) // Forçando a exibição de NullPointer ao chamar uma função em uma propriedade nula
}