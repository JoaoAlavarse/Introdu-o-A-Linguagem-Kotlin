fun main() {
    println("Insira o valor de inicio")
    val startValue = readln().toInt()

    println("Insira o valor de termino")
    val finalValue = readln().toInt()

    if (finalValue <= startValue){
        throw IllegalArgumentException("Valor de termino menor ou igual ao valor de inicio")
    }

    fizzBuzz(startValue, finalValue)

}

fun fizzBuzz(startValue: Int, finalValue: Int){
    for (i in startValue .. finalValue){
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz")
        } else if (i % 5 == 0){
            println("Buzz")
        } else if (i % 3 == 0 ){
            println("Fizz")
        } else {
            println(i)
        }
    }
}