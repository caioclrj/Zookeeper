fun main() {
    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val numberThree = readLine()!!.toInt()
    println(
        numberOne != numberTwo &&
            numberOne != numberThree &&
            numberTwo != numberThree
    ) // put your code here
}