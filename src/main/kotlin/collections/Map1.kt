package collections

fun main(args: Array<String>) {
    /**
     * O Map é um tipo de Collection que tem uma chave e um valor
     * A sua chave deve ser única enquanto que o valor pode se repetir em diversas chaves
     * Ele não guarda a ordem de inserção e se um mesmo elemento for incluído para uma chave existente,
     * ele será substituído
     */
    val map = HashMap<Long, String>()
    map.put(10020030040, "João")
    map.put(30040050060, "Maria")
    map.put(60070080090, "Pedro")

    map.put(60070080090, "Pedro Filho")

    /**
     * Ao percorrer o Map desta forma, ele irá exibir a chave e o valor
     * Se utilizar o "map.entries" no lugar de apenas "map", ele terá o mesmo comportamento
     */
//    for (par in map) {
    for (par in map.entries) {
        println(par)
    }

    /**
     * Percorrer o Map apenas pelos valores incluídos nele
     */
    for (nome in map.values) {
        println(nome)
    }

    /**
     * Percorrer o Map apenas pelas chaves incluídas nele
     */
    for (cpf in map.keys) {
        println(cpf)
    }

    /**
     * Percorrer o Map utilizando o operador destructuring para poder obter a chave e o valor
     * separadamente
     */
    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }

    /**
     * Exibe o tamanho de elementos dentro do Map
     */
    map.size.print()

    /**
     * Recupera um valor a partir da chave
     */
    map.get(30040050060)?.print()
    map[30040050060]?.print()

    /**
     * Verificar se uma determinada chave contain dentro do Map
     * Pode ser utilizado o "containsKey" para deixar explícito e verificar se existe uma determinada
     * chave e o "contains.value" para verificar se existe um determinado valor
     */
    map.contains(30040050060).print()

    /**
     * Remove um determinado elemento do Map a partir da chave informada
     * Essa função retorna o valor do elemento removido
     */
    map.remove(30040050060)?.print()

    /**
     * Limpa o Map
     */
    map.clear()

    /**
     * Verifica se o Map está vazio
     */
    map.isEmpty().print()
}
