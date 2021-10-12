import kotlin.math.abs

const val ONE = 1
const val TWO = 2

fun main() {
    val h1 = readLine()!!
    val x1 = h1.split(' ').first().toInt()
    val y1 = h1.split(' ').last().toInt()
    val h2 = readLine()!!
    val x2 = h2.split(' ').first().toInt()
    val y2 = h2.split(' ').last().toInt()

    println(
        if (
            abs(x1 - x2) == ONE && abs(y1 - y2) == TWO ||
            abs(x1 - x2) == TWO && abs(y1 - y2) == ONE
        ) {
            "YES"
        } else {
            "NO"
        }
    ) // write your code here
}