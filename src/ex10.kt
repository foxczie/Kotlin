// Faça um programa em Kotlin que leia quanto dinheiro uma pessoa tem na carteira (em
//R$) e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. (ou
//cotação atual)

fun main() {
    println("Digite o valor em reais que existe na sua carteira:")
    val reais = readLine()!!.toDouble()
    var dolar = reais / 3.45
    println("Você consegue comprar US$${"%.2f".format(dolar)} com o valor da sua carteira.")
    }

