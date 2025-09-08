// Desenvolva um programa em Kotlin que leia uma distância em metros e mostre os
//valores relativos em outras medidas.

fun main() {
    println("Digite a distância em metros:")
    val metros = readLine()!!.toFloat()
    val centimetros = metros * 10
    println("A distância de $metros m em centímetros é de $centimetros cm.")
}