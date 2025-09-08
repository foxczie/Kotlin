// Faça um programa em kotlin que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.

fun main() {
    println("Digite o valor do salário do funcionário:")
    var salario = readLine()!!.toDouble()
    var aumento = salario * 0.15
    var salariofinal = salario + aumento
    println("O valor do salário com aumento é de R$$salariofinal.")
}