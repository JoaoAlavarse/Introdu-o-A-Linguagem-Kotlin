fun main() {
    val name = setName()
    twoFer(name)
}

fun setName(): String?{
    println("Insira seu nome: ")
    return readlnOrNull()
}

fun verifyInvalidName(name: String?): Boolean{
    return name.isNullOrBlank()
}

fun twoFer(name: String?){
    if (verifyInvalidName(name)){
        println("Um para você, um para mim")
        return
    }
    println("Um para $name, um para mim")
}