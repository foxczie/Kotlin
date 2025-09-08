// Faça um programa em Kotlin que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.

fun main() {
    println("Digite um número:")
    val numero = readLine()!!.toInt()
    val antecessor = (numero - 1)
    val sucessor = (numero + 1)
    println("O antecessor de $numero é $antecessor e seu sucessor é $sucessor.")
}