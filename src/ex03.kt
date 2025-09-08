// Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma
//mensagem.

fun main() {
    println("Digite seu nome:")
    val nome = readLine()
    println("Digite seu salário:")
    val salario = readLine()
    println("O nome do funcionário é $nome e seu salário é de R$$salario.")
}