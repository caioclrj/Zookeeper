const val ZERO = 0
fun main() {
    val numbers = mutableListOf<Int>()
    do {
        numbers.add(readLine()!!.toInt())
    } while (numbers.last() != ZERO) // put your code here
    println(numbers.sorted().last())
}