fun main() {
    val classOne = readLine()!!.toInt()
    val classTwo = readLine()!!.toInt()
    val classThree = readLine()!!.toInt() // put your code here
    println(
        classOne / 2 + classOne % 2 +
            classTwo / 2 + classTwo % 2 +
            classThree / 2 + classThree % 2
    )
}