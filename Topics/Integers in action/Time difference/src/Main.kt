fun main() {
    val factor = 60
    val firstHours = readLine()!!.toInt() * factor * factor
    val firstMinutes = readLine()!!.toInt() * factor + firstHours
    val firstSeconds = readLine()!!.toInt() + firstMinutes // put your code here
    val secondHours = readLine()!!.toInt() * factor * factor
    val secondMinutes = readLine()!!.toInt() * factor + secondHours
    val secondSeconds = readLine()!!.toInt() + secondMinutes
    println(secondSeconds - firstSeconds)
}