const val pi = 3.14159265

fun main() {
    println("Insira o valor do raio")
    val raio = readln().toDouble()

    val a = pi * raio * raio

    println("Valor da area: $a")
}