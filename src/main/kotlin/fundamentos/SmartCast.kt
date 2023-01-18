package fundamentos

/*
 * Smart Cast
 *  Cast automático sem a necessidade de fazer explicitamente por conta da checagem realizada
 *  automaticamente nas linhas 11 e 13, nas linhas 12 e 14 a conversão já ocorreu de forma implícita
 *  sendo possível fazer o uso do code completion
 */

fun souEsperto(x: Any) {
    if (x is String) {
        println(x.uppercase())
    } else if (x is Int) {
        println(x.plus(3))
    }
}

fun souEsperto2(x: Any) {
    // No caso do when, o else obrigatoriamente deve vir por último
    // A execução do when, é realizada apenas em uma única seleção, diferentemente do switch do java
    when (x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Repense a sua vida!")
    }
}

fun main(args: Array<String>) {
    souEsperto("Ola")
    souEsperto(9)

    souEsperto2("Opa")
    souEsperto2(7)
    souEsperto2(true)
}