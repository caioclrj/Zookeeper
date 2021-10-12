const val NEGFIFTEEN = -15
const val TWELVE = 12
const val FOURTEEN = 14
const val SEVENTEEN = 17
const val NINETEEN = 19

fun main() {
    val number = readLine()!!.toInt()
    print(
        if (
            number > NEGFIFTEEN && number <= TWELVE ||
            number > FOURTEEN && number < SEVENTEEN ||
            number >= NINETEEN
        ) {
            "True"
        } else {
            "False"
        }
    ) // write your code here
}