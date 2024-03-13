package br.edu.umfg.calculadora

class Result(
    val oneValue: Double,
    val anotherValue: Double,
    val operation: String,
    val result: Double
) {
    override fun toString(): String {
        return "O resultado de $oneValue $operation $anotherValue é igual a $result"
    }
}
