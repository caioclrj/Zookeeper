const val FIRST = 1

fun main() {
    val number = mutableListOf(FIRST)
    val value = readLine()!!.toInt() // put your code here

    while (number.last() * number.last() <= value) {
        println(number.last() * number.last())
        number.add(number.last() + 1)
    }
}