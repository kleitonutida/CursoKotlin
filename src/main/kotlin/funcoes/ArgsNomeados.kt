package funcoes

/**
 * Criando uma função que recebe dois parâmetros do tipo string e que retorna um texto específico
 */
fun relacaoDeTrabalho(chefe: String, funcionario: String): String = "$funcionario é subordinado(a) à $chefe"

fun main(args: Array<String>) {
    /**
     * Chamando a função sem passar os argumentos nomeados
     * Note que sem a ajuda da IDE não é possível identificar quem seria o funcionário e quem seria
     * o chefe apenas olhando para os parâmetros da função
     */
    println(relacaoDeTrabalho("João", "Maria"))
    /**
     * Chamando a função passando os argumentos nomeados
     * Note que neste caso acaba ficando mais claro quem é o funcionário e que é o chefe
     */
    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria"))
}
