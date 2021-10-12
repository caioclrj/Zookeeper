import kotlin.math.abs

fun main() {
    val h1 = readLine()!!
    val x1 = h1.split(' ').first().toInt()
    val y1 = h1.split(' ').last().toInt()
    val h2 = readLine()!!
    val x2 = h2.split(' ').first().toInt()
    val y2 = h2.split(' ').last().toInt()

    println(
        if (
            x1 == x2 || y1 == y2 ||
            abs(x1 - x2) == abs(y1 - y2)
        ) {
            "YES"
        } else {
            "NO"
        }
    ) // write your code here
}