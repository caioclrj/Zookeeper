const val TWO = 2
const val THREE = 3
const val FIVE = 5

fun main() {
    val number = readLine()!!.toInt()
    if (number % TWO == 0) println("Divided by $TWO")
    if (number % THREE == 0) println("Divided by $THREE")
    if (number % FIVE == 0) println("Divided by $FIVE")
    if (number % (TWO * THREE) == 0) println("Divided by ${TWO * THREE}")
    // put your code here
}