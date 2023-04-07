package lambdas

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf(
    Produto(nome = "Fichário escolar", preco = 21.90),
    Produto(nome = "Lápis de cor", preco = 11.90),
    Produto(nome = "Borracha bicolor", preco = 0.70),
    Produto("Apontador com depósito", preco = 1.80),
)

fun main(args: Array<String>) {
    val totalizar = { total: Double, atual: Double -> total + atual }

    /**
     * Utilização do map para percorrer cada um dos preços de cada um dos produtos da lista
     * Depois é utilizado o reduce para pegar cada um dos preços e calcular o valor total
     */
    val precoTotal = materialEscolar.map { it.preco }
        .reduce(totalizar)

//    val precoTotal = materialEscolar.map { it.preco }
//        .reduce( {total, atual -> total + atual })

    println("O preço médio é ${precoTotal / materialEscolar.size}.")
}
