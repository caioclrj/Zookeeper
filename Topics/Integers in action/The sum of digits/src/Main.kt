fun main() {
    val dez = 10
    val cem = 100
    val number = readLine()!!.toInt()
    val hundreds = number / cem
    val tens = number / dez % dez
    val units = number % dez
    println(hundreds + tens + units) // put your code here
}
