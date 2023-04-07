package lambdas

data class Casa(var endereco: String = "", var num: Int = 0)

fun main(args: Array<String>) {
    var casa = Casa()

    /**
     * Utilizando a função run para acessar o objeto corrente e atribuir novos valores para as suas
     * propriedades. Neste caso poderia ser utilizado o apply também, a diferença é que no caso do run
     * o retorno será o resultado da expressão lambda, enquanto no apply o resultado é o próprio
     * objeto
     */
    casa.run {
        endereco = "Rua ABC"
        num = 1544
    }

    println(casa)
}
