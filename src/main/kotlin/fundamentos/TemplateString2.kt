package fundamentos

fun main(args: Array<String>) {
    val bomHumor = true

    /**
     * String template sendo utilizado para interpretar uma expressão em um texto
     * Neste caso o próprio Kotlin interpreta o que está entre '${}' não
     * sendo necessário incluir o caractere de escape para tratar as aspas duplas
     */
    print("Hoje estou ${if (bomHumor) "feliz" else "chateado"}.")
}
