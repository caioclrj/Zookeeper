const val MINYEAR = 1900
const val MAXYEAR = 3000
const val ZERO = 0
const val FOUR = 4
const val HUNDRED = 100
const val FOURHUNDRED = 400

fun main() {
    val year = readLine()!!.toInt()

    println(
        if (
            year >= MINYEAR && year <= MAXYEAR &&
            year % FOUR == ZERO &&
            (
                year % FOURHUNDRED == ZERO ||
                    year % HUNDRED != ZERO
                )
        ) "Leap" else "Regular"
    ) // write your code here
}