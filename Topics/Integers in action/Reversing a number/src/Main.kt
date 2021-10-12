fun main() {
    val dez = 10
    val cem = 100
    val number = readLine()!!.toInt()
    val hundreds = number % dez * cem
    val tens = number % cem / dez * dez
    val units = number / cem
    println(hundreds + tens + units) // put your code here
}