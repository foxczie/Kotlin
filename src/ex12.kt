// Desenvolva uma programa em kotlin que leia os valores de A, B e C de uma
//equação do segundo grau e mostre o valor de Delta. (formula Δ = b
//2 – 4ac)

fun main() {
    println("Digite o valor de A:")
    val a = readLine()!!.toDouble()

    println("Digite o valor de B:")
    val b = readLine()!!.toDouble()

    println("Digite o valor de C:")
    val c = readLine()!!.toDouble()

    val delta = b * b - 4 * a * c

    println("O valor de delta é: $delta")
}
