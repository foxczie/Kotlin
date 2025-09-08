// Crie um programa kotlin que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 por
//hora trabalhada.

fun main() {
    println("Quantos dias foram trabalhados?")
    var dias = readLine()!!.toInt()
    var salario = (dias * 8) * 25
    println("O salário deste mês é de R$$salario.")

}