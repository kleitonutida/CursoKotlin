package classes

// Após instanciar a classe, o atributo nome estará visível para leitura e escrita
class Pessoa1(var nome:String)

// Após instanciar a classe, o atributo nome estará visível apenas para leitura
class Pessoa2(val nome:String)

// Após instanciar a classe, o atributo nome não estará visível, ele é uma variável local
// A variável vai estar disponível internamente no construtor ou no processo de inicialização do objeto
class Pessoa3(nomeInicial: String) {
    // Variável criada para disponibilizar o nome
    val nome: String = nomeInicial
}

fun main(args: Array<String>) {
    val p1 = Pessoa1(nome = "João")
    p1.nome = "Guilherme"
    println("${p1.nome} sabe programar!")

    val p2 = Pessoa2("Maria")
    val p3 = Pessoa3(nomeInicial = "Pedro")
    println("${p2.nome} e ${p3.nome} são legais!")
}