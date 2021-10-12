const val ONE = 1
const val TWO = 2
const val THREE = 3
fun main() {
    val numbers = mutableListOf(readLine()!!.toInt())
    while (numbers.last() != ONE) {
        if (numbers.last() % TWO == 0) {
            numbers.add(numbers.last() / TWO)
        } else {
            numbers.add(numbers.last() * THREE + ONE)
        }
    } // put your code here
    println(numbers.joinToString(" ", "", ""))
}