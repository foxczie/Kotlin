// Faça um programa em Kotlin que leia as duas notas de um aluno em uma matéria e
//mostre na tela a sua média na disciplina.

fun main() {
    println("Digite a primeira nota da disciplina:")
    val a = readLine()!!.toDouble()
    println("Digite a segunda nota da disciplina:")
    val b = readLine()!!.toDouble()
    val media = (a + b) / 2
    println("A média do aluno é de $media.")
}