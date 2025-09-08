// Desenvolva um programa em Kotlin que leia dois números inteiros e mostre o somatório
//entre eles.

fun main() {
    println("Digite um número:")
    val a = readLine()!!.toInt()
    println("Digite outro número:")
    val b = readLine()!!.toInt()
    val soma = a + b
    println("A soma dos números digitados é de $soma.")
}