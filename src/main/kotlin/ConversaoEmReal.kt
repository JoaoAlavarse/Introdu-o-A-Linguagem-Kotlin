fun main() {
    println("Insira a cotacao do dolar")
    val cotacao = readln().toDouble()

    println("Insira a quantidade de dolares disponiveis")
    val dolares = readln().toDouble()

    val reais = dolares * cotacao

    println("Voce possui $reais reais")
}