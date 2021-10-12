fun main() {
    val n = readLine()!!.toInt()
    val value = mutableListOf<Int>()
    repeat(n) {
        value.add(readLine()!!.toInt())
    }
    println("${value.filter { it > 0 }.count()}") // put your code here
}