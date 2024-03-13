fun main() {
    println("Insira o comprimento")
    val comprimento = readln().toDouble()

    println("Insira a largura")
    val largura = readln().toDouble()

    println("Insira a altura")
    val altura = readln().toDouble()

    val volume = comprimento * altura * largura

    println("Volume da caixa: $volume")
}