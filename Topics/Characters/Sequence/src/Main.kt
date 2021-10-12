fun main() {
    val charOne = readLine()!!.first()
    val charTwo = readLine()!!.first()
    val charThree = readLine()!!.first()
    println(
        charOne.code == (charTwo - 1).code && // write your code here
            charTwo.code == (charThree - 1).code
    )
}