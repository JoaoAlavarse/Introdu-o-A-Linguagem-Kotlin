fun main() {
    println("Insira o valor da hora aula")
    val valorHora = readln().toDouble()

    println("Insira a quantidade de horas trabalhadas no mes")
    val horasTrabalhadas = readln().toDouble()

    println("Insira o percentual de desconto")
    val percentual = readln().toDouble()

    val salarioBruto = valorHora * horasTrabalhadas

    val totalDesconto = salarioBruto * (percentual / 100)

    val salarioLiquido = salarioBruto - totalDesconto

    println("Salario Bruto: $salarioBruto")
    println("Salario Liquido: $salarioLiquido")
}