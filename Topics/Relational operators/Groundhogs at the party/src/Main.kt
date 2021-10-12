fun main() {
    val numberOfPeanuts = readLine()!!.toInt()
    val isItWeekend = readLine()!!.toBoolean()
    println(
        isItWeekend &&
            numberOfPeanuts >= 15 && numberOfPeanuts <= 25 ||
            !isItWeekend &&
            numberOfPeanuts >= 10 && numberOfPeanuts <= 20
    ) // write your code here
}