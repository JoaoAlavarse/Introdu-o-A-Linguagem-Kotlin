fun main() {
    var soma = 0

    println("Insira o valor de inicio")
    val startValue = readln().toInt()

    println("Insira o valor de termino")
    val finalValue = readln().toInt()

    if (finalValue <= startValue){
        throw IllegalArgumentException("Valor de termino menor ou igual ao valor de inicio")
    }

    for (i in startValue .. finalValue){
        if (i % 2 == 0){
            soma += i
        }
    }

    println("Valor da soma: $soma")
}