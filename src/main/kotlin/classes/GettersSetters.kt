package classes

class Cliente2 {
    constructor(nome: String) {
        this.nome = nome
    }

    /*
     * Ao redefinir o método get, para acessar a variável corrente, utilize a palavra "field"
     * O "get" e o "set" podem ser definidos com um bloco de código ou apenas em uma única linha
     *
     * Os métodos "get" e "set" serão chamados independentemente se ele é informado na invoação do método,
     * neste caso facilita que eles não precisam ser implementados todas as vezes e sim apenas quando for
     * necessário ter algo mais customizado
     *
     * takeIf — Valida se a expressão informada é verdadeira ou falsa, se for verdadeiro será retornado o
     * valor da variável, caso contrário será retornado nulo
     */
    var nome: String
        get() = "Meu nome é $field"
        set(value) {
            field = value.takeIf { value.isNotEmpty() } ?: "Anônimo"
        }
}

fun main(args: Array<String>) {
    val c1 = Cliente2("")
    println(c1.nome)

    val c2 = Cliente2("Pedro")
    c2.nome = "Ana"
    println(c2.nome)
}