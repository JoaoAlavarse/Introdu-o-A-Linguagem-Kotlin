fun main() {
    println("Insira a cotacao do dolar")
    val cotacao = readln().toDouble()

    println("Insira a quantidade de reais disponiveis")
    val reais = readln().toDouble()

    val dolares = reais / cotacao

    println("Voce possui $dolares dolares")
}