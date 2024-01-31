package collections

/**
 * Definição de uma classe chamada Fruta que será utilizado para criar uma lista
 */
data class Fruta(var nome: String, var preco: Double)

fun main(args: Array<String>) {
    /**
     * Criando uma lista de objetos do tipo Fruta
     */
    var frutas = arrayListOf(Fruta("Banana", 1.50), Fruta("Morango", 3.20))

    /**
     * Realizado o cast a partir do tipo da variável
     * Se fosse um array com tipos diferentes, seria uma lista do tipo Any
     */
    for (fruta in frutas) {
        println("${fruta.nome} - R$ ${fruta.preco}")
    }

    /**
     * Retorna o tamanho da lista
     */
    frutas.size

    /**
     * Obter um determinado elemento pelo índice, começando a partir do zero
     */
    frutas.get(0)

    /**
     * Adicionar um elemento
     */
    frutas.add(Fruta("Melancia", 8.00))

    /**
     * Adicionar uma elmento a partir do índice
     */
    frutas.add(2, Fruta("Maçã", 1.2))

    /**
     * Adicionar vários elementos, como se fosse uma união
     * O arraylist mantém a ordem de inclusão, então se for incluído um elemento em um determinado
     * índice, será feito o deslocamentos dos elementos seguintes
     */
    frutas.addAll(listOf(Fruta("Caju", 2.00), Fruta("Laranja", 1.00)))

    /**
     * Limpar uma lista
     */
    frutas.clear()

    /**
     * Clonar uma lista
     */
    frutas.clone()

    /**
     * Verificar se um determinado elemento está contido dentro da lista
     * Como está sendo utilizado um data class, ele utilizado o equal e o hashcode implementado por ele
     * para fazer a comparação. Caso não fosse um data class o resultado seria igual a falso
     */
    frutas.contains(Fruta("Caju", 2.00))

    /**
     * Método para percorrer uma lista e realizar alguma execução
     */
    frutas.forEach({ it -> println(it) })

    /**
     * Verifica se uma lista está vazia ou não, retornando verdadeiro ou falso
     */
    frutas.isEmpty()

    /**
     * Recuperar o último elemento
     */
    frutas.last()

    /**
     * Remover um elemento da lista
     */
    frutas.remove(Fruta("Caju", 2.00))

    /**
     * Substituir um elemento da lista
     */
    frutas.replaceAll { it -> Fruta(it.nome, 1.0) }

    /**
     * Obter uma sublista a partir do índice inicial e do índice final de uma lista
     */
    frutas.subList(1, 2)

    /**
     * Unir duas listas
     */
    frutas.union(listOf(Fruta("Caju", 2.00)))

    /**
     * Retorna os elementos que possuem o valor único da condição informada
     * Se tiver uma de um elemento com o mesmo valor, será retornado o primeiro
     */
    println(frutas.distinctBy { it.preco })
}
