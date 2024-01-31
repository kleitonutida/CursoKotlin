package collections

fun main(args: Array<String>) {
    /**
     * Criação de um Set sem ordenação
     */
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    /**
     * A partir do momento que um Set é criado, não é possível adicionar um elemento que não seja
     * do mesmo tipo. Neste caso ele inferiu automaticamente o tipo do Set para String
     */
    // aprovados.add(1)

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    /**
     * Set que garante a ordem de inclusão dos registros
     */
    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    /**
     * Set que garante a ordem natural dos registros incluídos
     */
    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    println("\nSorted...")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    /**
     * Ordem maluca...
     * Criação de um Set definindo a ordenação de acordo com algum critério
     */
    aprovados.sortedBy { it.substring(1) }.print()
    /**
     * Realizando a ordenação pela ordem inversa do critério definido
     */
    aprovados.sortedBy { it.substring(1).reversed() }.print()
}
