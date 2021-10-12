const val ZERO = 0
const val FOUR = 4
fun main() {
    val n = readLine()!!.toInt()
    val value = mutableListOf<Int>()
    repeat(n) {
        value.add(readLine()!!.toInt())
    }
    println("${value.filter { it % FOUR == ZERO }.maxOrNull()}") // put your code here
}