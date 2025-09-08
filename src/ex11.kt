// Faça um programa em kotlin que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.

fun main() {
    println("Digite o valor da altura da parede:")
    val altura = readLine()!!.toDouble()
    println("Digite o valor da largura da parede:")
    val largura = readLine()!!.toDouble()
    val area = altura * largura
    val tinta = area / 2
    println("Para cobrir a sua parede, serão necessários $tinta litros de tinta.")
}