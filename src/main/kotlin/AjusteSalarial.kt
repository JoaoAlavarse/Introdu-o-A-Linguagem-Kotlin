fun main() {
    println("Entre com o valor do salario mensal")
    var salario = readln().toDouble()

    println("Entre com o percentual de aumento")
    val percentual = readln().toDouble()

    salario += (salario * (percentual / 100))

    println("Novo valor do salario $salario")

}