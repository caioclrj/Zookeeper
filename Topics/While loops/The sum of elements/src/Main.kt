const val ZERO = 0
fun main() {
    val numbers = mutableListOf<Int>()
    do {
        numbers.add(readLine()!!.toInt())
    } while (numbers.last() != ZERO)
    println(numbers.sum()) // put your code here
}