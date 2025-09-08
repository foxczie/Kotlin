// Crie um programa em Kotlin que leia um número real e mostre na tela o seu dobro
//e a sua terça parte.

fun main() {
    println("Digite um número:")
    val numero = readLine()!!.toInt()
    val dobro = numero * 2
    val terca = numero.toFloat() / 3
    println("O dobro de $numero é $dobro e sua terça parte é $terca")
}