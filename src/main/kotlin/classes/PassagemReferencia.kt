package classes

/*
 * Os dados são passados por referência e dentro de uma função, as referências são constantes
 *
 * Uma vez que o dado é passado por referência dentro de um método, não pode ser alterado a referência
 * do parâmetro recebido. Mas os parâmetros internos passados para um determinado objeto podem ser
 * alterados
 */

// Erro!! Kotlin: Val cannot be reassigned
//fun porReferencia(velocidade: Int) {
//    velocidade++
//}

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

/*
 * Neste caso o carro continua com a mesma referência e a velocidade é uma variável
 */
fun porReferencia(carro: Carro){
    carro.velocidade++
}

fun main(args: Array<String>) {
    var carro1 = Carro(marca = "Ford", modelo = "Fusion")

    /*
     * Criando "carro2" a partir do "carro1" e alterando o modelo do carro
     * Esse tipo de atribuição faz com que o "carro2" aponte para a mesma referência de "carro1", sendo
     * que qualquer alteração dos atribuitos de "carro2" afetará o "carro1" e o inverso também é
     * verdadeiro
     */
    var carro2: Carro = carro1
    carro2.modelo = "Edge"
    println(carro1)

    /*
     * Como o "carro1" será atribuido a uma nova instância, os valores de ambos os carros serão
     * diferentes
     */
    carro1 = Carro("Audi", "A4")
    println(carro2)
    println(carro1)

    porReferencia(carro1)
    porReferencia(carro2)

    println(carro1)
    println(carro2)

    var a = 1
    var b = a
    println(a === b)
    b++ // Aqui ocorre a mudança de referência da variável
    println(a === b)
    println(a)
    println(b)
}