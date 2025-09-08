//Escreva um programa em kotlin que pergunte a quantidade de Km percorridos por um carro alugado
//e a quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$ 90,00 por dia e R$ 0,20 por Km rodado.

fun main() {
    println("Digite a quantidade de KM percorridos:")
    var km = readLine()!!.toDouble()
    println("Digite quantos dias foi alugado:")
    var dias = readLine()!!.toInt()
    var valorkm = km * 0.20
    var valordias = dias * 90
    var valorfinal = valorkm + valordias
    println("O valor final a ser pago é de R$$valorfinal.")
}
