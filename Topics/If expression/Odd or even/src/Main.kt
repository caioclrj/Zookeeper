const val ZERO = 0
const val TWO = 2
fun main() {
    println(
        if (readLine()!!.toInt() % TWO == ZERO) "EVEN" else "ODD"
    )
    // write your code here
}