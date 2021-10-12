fun main() {
    val h1 = readLine()!!.toInt() // put your code here
    val h2 = readLine()!!.toInt()
    val h3 = readLine()!!.toInt()
    println(
        h1 >= h2 && h2 >= h3 || h1 <= h2 && h2 <= h3
    )
}