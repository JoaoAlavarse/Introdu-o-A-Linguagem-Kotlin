package br.edu.umfg.calculadora

private val operationsAccepted = arrayOf("+", "-", "*", "/")
private val results: MutableList<Result> = mutableListOf()

fun main() {
    println("Bem-Vindo a maravilhosa calculadora em Kotlin")
    var started = true
    while (started) {
        val oneValue = readDouble()
        val anotherValue = readDouble(label = "Digite o segundo valor:")
        val operation = readOperation()
        val result = calculate(operation, oneValue, anotherValue)
        println(result)
        results.add(result)

        println("Deseja continuar calculando (S/n)?")
        val answer = readln()
        started = "s".equals(answer, true)
    }
    for (it in results) {
        println(it)
    }
}

private fun calculate(operation: String, oneValue: Double, anotherValue: Double): Result {
    return when (operation) {
        "+" -> Result(oneValue, anotherValue, operation, oneValue+anotherValue)
        "-" -> Result(oneValue, anotherValue, operation, oneValue-anotherValue)
        "*" -> Result(oneValue, anotherValue, operation, oneValue*anotherValue)
        "/" -> Result(oneValue, anotherValue, operation, oneValue/anotherValue)
        else -> throw IllegalArgumentException("Operação inválida.")
    }
}

fun readDouble(label: String = "Digite o primeiro valor:"): Double {
    while (true) {
        try {
            println(label)
            return readln().toDouble()
        } catch (ex: Exception) {
            println("Valor inválido.")
        }
    }
}

fun readOperation(): String {
    while (true) {
        try {
            println("Qual operação deseja? (+,-,*,/)")
            val operacao = readln()
            if (operacao in operationsAccepted) {
                return operacao
            }
            throw IllegalArgumentException("A operação escolhida não existe. Informe uma opção válida!")
        } catch (ex: Exception) {
            println(ex.message)
        }
    }
}
