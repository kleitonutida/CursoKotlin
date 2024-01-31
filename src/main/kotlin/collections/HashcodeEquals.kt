package collections

class Objeto(val nome: String, val descricao: String) {
    /**
     * Reimplementando o hashcode para o tamanho da string "nome"
     */
    override fun hashCode(): Int {
        return nome.length
    }

    /**
     * Reimplementando o equals para comparar apenas o nome e sem distinção de letras maiúsculas e
     * minúsculas
     */
    override fun equals(other: Any?) = if (other is Objeto) nome.equals(other.nome, ignoreCase = true) else false
}

fun main(args: Array<String>) {
    val conjunto = hashSetOf(
        Objeto("Cadeira", "..."), // Hashcode = 7
        Objeto("Mesa", "..."), // Hashcode = 4
        Objeto("Faca", "..."), // Hashcode = 4
        Objeto("Copo", "..."), // Hashcode = 4
    )

    /**
     * Hashcode e Equals
     *
     * Ele é como se fosse um índice de um banco de dados. É utilizado para determinar um subconjunto dentro de
     * um conjunto maior, para somente depois ser utilizado o equals para realizar uma comparação mais profunda.
     * O equals é um método mais lento que o Hashcode, pois o Hashcode retorna um número.
     * Então, quanto mais único for o Hashcode dentro de um estrutura Hash mais rápido será a resposta para dizer se
     * o elemento foi encontrado ou não. Se para cada elemento que tiver um Hashcode único, quando ele utilizar o
     * Hashcode para encontrar o subconjunto que tem mesmo Hashcode ele vai encontrar apenas um único elemento e depois
     * será executado o Equals em cima daquele único elemento
     * Quanto mais único for o Hashcode, melhor será. O Hashcode não pode ser um número randômico, ou seja, dado um
     * conjunto de dados que são relevantes para a igualdade de dois objetos, sempre que for passados os mesmos dados
     * o Hashcode tem que ser o mesmo, tem que ser um valor deterministico
     * Resumindo, o Equals e o Hashcode precisam estar alinhados. O Hashcode precisa ser um valor determinístico em cima
     * dos valores que serão utilizado para verificar a igualdade e o Equals deve utilizar os mesmos critérios de
     * valores utilizado no Hashcode. O Hashcode realiza uma pesquisa rápida/superficial que gera um conjunto de
     * elementos que serão testados a partir do Equals que é de fato o método que vai definir se um objeto é igual a
     * outro
     */

    /**
     * Aqui ele verificou todos os elementos que contém o mesmo Hashcode para depois utilizar o equals dentro do
     * subconjunto filtrado pelo Hashcode
     */
    conjunto.contains(Objeto("faca", "???")).print()
}
