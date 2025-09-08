// Crie um programa em Kotlin que leia o preço de um produto, calcule e mostre o
//seu PREÇO PROMOCIONAL, com 5% de desconto.

fun main() {
    println("Digite o valor do produto:")
    var produto = readLine()!!.toDouble()
    var promocao = produto * 0.05
    var valorfinal = produto - promocao
    println("O valor promocional do seu produto é de R$$valorfinal.")
}