package classes

var desconto: Double = 0.0

class ItemDePedido(val nome: String, val preco: Double) {
    companion object {
        fun create(nome:String, preco: Double) = ItemDePedido(nome, preco)

        /*
         * Definição do desconto como variável estática de classe, qualquer alteração realizada nela
         * será refletida para todas as instâncias. Neste caso, uma alternativa é a criação de variáveis
         * ou funções top-level
         */
//        @JvmStatic var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double {
        return preco - preco * desconto
    }
}

fun main(args: Array<String>) {
    val item1 = ItemDePedido.create("TV 50 Polegadas", 2989.90)
    val item2 = ItemDePedido("Liquidificador", 200.00)
//    ItemDePedido.desconto = 0.10
    desconto = 0.0

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}