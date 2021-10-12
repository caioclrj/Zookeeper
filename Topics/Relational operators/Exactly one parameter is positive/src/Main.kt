fun main() {
    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val numberThree = readLine()!!.toInt()
    println(
        numberOne > 0 &&
            numberTwo <= 0 &&
            numberThree <= 0 ||
            numberTwo > 0 &&
            numberOne <= 0 &&
            numberThree <= 0 ||
            numberThree > 0 &&
            numberTwo <= 0 &&
            numberOne <= 0
    ) // put your code here
}