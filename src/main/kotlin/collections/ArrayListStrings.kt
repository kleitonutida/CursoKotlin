package collections

fun main(args: Array<String>) {
    /**
     * Criando uma lista de Strings a partir da função utilitária "arrayListOf"
     * Não é necessário informar o tipo da lista, ela será gerada a partir da inferência dos
     * valores incluídos dentro da String 'arrayListOf<String>("Carro", "Moto", "Barco", "Avião")'
     *
     */
    val strings = arrayListOf("Carro", "Moto", "Barco", "Avião")

    for (item in strings) {
        /**
         * Não é necessário realizar o cast, pois ele já irá inferir o tipo da variável facilitando
         * o uso das funções
         */
        println(item.uppercase())
    }
}
