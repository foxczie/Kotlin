
fun main() {
    println("Qual o valor da massa?")
    val m = readln().toDouble() // variável que lê a massa
    println("Qual o valor da aceleração?")
    val a = readln().toDouble() // variável que lê a aceleração
    println("O valor da força é: ${calculoForca(m,a)}") // chamada de função
}
fun calculoForca(m: Double, a: Double): Double {
    return m * a // retorno do cálculo da força
}