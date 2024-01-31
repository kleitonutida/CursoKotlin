package fundamentos

fun main(args: Array<String>) {
    val bomHumor = true
    /**
     * String template sendo utilizado para interpretação de uma expressão dentro de um texto
     * Neste caso o próprio Kotlin consegue interpretar corretamente o que está dentro de '${}' não
     * sendo necessário incluir o caractere de escape para tratar as aspas duplas
     */
    print("Hoje estou ${if (bomHumor) "feliz" else "chateado"}.")
}
