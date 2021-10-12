const val TWO = 2
const val THREE = 3
const val FOUR = 4
const val FIVE = 5

fun main() {
    val n = readLine()!!.toInt()
    val value = mutableListOf<Int>()
    repeat(n) {
        value.add(readLine()!!.toInt())
    }
    print(
        "${value.filter { it == TWO }.count()} " +
            "${value.filter { it == THREE}.count()} " +
            "${value.filter { it == FOUR }.count()} " +
            "${value.filter { it == FIVE }.count()}"
    ) // put your code here
}