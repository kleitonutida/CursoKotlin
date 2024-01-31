package lambdas

fun main() {
    println("Digite a sua mensagem: ")

    /**
     * Recebe uma entrade de algo digitado no console
     */
    val entrada = readLine()

    /**
     * Utiliza o takeif para realizar uma validação no valor da entrada.
     * Valida se o valor é diferente de branco, se for branco será retornado a mensagem "Sem mensagem"
     * caso contrário será retornado a mensagem. E para tratar espaços em branco foi colocado a função
     * trim com o operador null safety, já que o valor de entrada por vir nulo
     */
    val mensagem = entrada.takeIf { it?.trim() != "" } ?: "Sem mensagem"

    println(mensagem)
}
