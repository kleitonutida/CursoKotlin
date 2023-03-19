package fundamentos

fun main(args: Array<String>) {
    /**
     * O operador de chamada segura ou safe call operator é o '?'
     * Com isso a variável pode ter um valor opcional, ou seja, ela não precisa ter valores ou
     * simplesmente receber nulo
     */
    var a: Int? = null // Safe call operator
    println(a?.dec())
}
