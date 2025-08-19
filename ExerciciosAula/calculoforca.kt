
fun main() {
    println("Qual o valor da massa?")
    val m = readln().toDouble()
    println("Qual o valor da aceleração?")
    val a = readln().toDouble()
    println("O valor da força é: ${calculoForca(m,a)}")
}
fun calculoForca(m: Double, a: Double): Double {
    return m * a
}