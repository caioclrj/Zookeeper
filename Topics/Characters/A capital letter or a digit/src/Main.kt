fun main() {
    val char = readLine()!!.first()
    println(
        char.code >= 49 && char.code <= 57 ||
            char.code >= 65 && char.code <= 90
    ) // write your code here
}