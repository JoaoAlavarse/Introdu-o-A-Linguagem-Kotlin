var oneValue = setValue()
var anotherValue = setValue()

fun main() {
    println("Valor de one value $oneValue antes")
    println("Valor de another value $anotherValue antes")
    changeValues()
    println("Valor de one value $oneValue depois")
    println("Valor de another value $anotherValue depois")
}

fun setValue(): String{
    println("Insira o valor")
    val value = readlnOrNull();
    if (value.isNullOrBlank()) {
        throw IllegalArgumentException("Valor invalido")
    }
    return value
}

fun changeValues(){
    val changer = oneValue
    oneValue = anotherValue
    anotherValue = changer

}