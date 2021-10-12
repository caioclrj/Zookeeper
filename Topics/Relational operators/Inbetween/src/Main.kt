fun main() {
    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val numberThree = readLine()!!.toInt()
    println(
        numberOne <= numberTwo &&
            numberOne >= numberThree ||
            numberOne >= numberTwo &&
            numberOne <= numberThree
    ) // put your code here
}