const val FIRST = 1
fun main() {
    val number = readLine()!!.toInt()
    var indice = FIRST
    var repetir = 0
    do {
        if (repetir + indice < number) {
            repeat(indice) {
                print("$indice ")
            }
            repetir += indice++
        } else {
            repeat(number - repetir) {
                print("$indice ")
            }
            repetir = number
        }
    } while (number != repetir) // put your code here
}