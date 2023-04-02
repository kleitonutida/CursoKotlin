package classes

/**
 * Classe para representar uma data
 */
class Data(var dia: Int, var mes: Int, var ano: Int) {
    /**
     * Função para formatar uma data a partir da data informada na classe
     */
    fun formatar(): String {
        return "$dia/$mes/$ano"
    }
}

fun main(args: Array<String>) {
    var nascimento: Data = Data(dia = 11, mes = 10, ano = 2003)

    println("${nascimento.dia}/${nascimento.mes}/${nascimento.ano}")
    /**
     * Utilizando a função inline "with". Neste caso, não é necessário chamar a instância para
     * acessar os atributos
     */
    with(nascimento) { println("$dia/$mes/$ano") }

    nascimento.mes = 11
    println(nascimento.formatar())
}
