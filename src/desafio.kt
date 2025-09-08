// Escreva um programa em kotlin para calcular a redução do tempo de vida
//de um fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos
//ele já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.

fun main() {
    println("Quantos cigarros são fumados ao dia?")
    var cigarros = readLine()!!.toInt()
    println("Há quantos anos é fumante?")
    var anos = readLine()!!.toDouble()

    var dias = anos * 365
    var cigarrosdia = dias * cigarros
    var perda = cigarrosdia * 10
    var vida = (perda / (60 * 24)).toInt()
    println("O fumante perdeu aproximadamente $vida dias de vida")
}