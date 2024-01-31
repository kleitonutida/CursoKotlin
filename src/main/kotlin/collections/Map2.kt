package collections

fun main(args: Array<String>) {
    /**
     * Esta é a forma de se criar um Map utilizando o hashMapOf
     * Para inclusão das chaves e valores deve-se utilizar o "to" entre a chave e o valor
     */
    val map = hashMapOf(1 to "Gui", 2 to "Rebeca", 3 to "Cibalena")

    /**
     * Utilizando o destructuring para passar pelos valores do map e imprimí-los
     */
    for ((id, nome) in map) {
        println("$id) $nome")
    }
}
