const val ZERO = 0
fun main() {
    val number = readLine()!!.toInt()
    print(
        if (number < ZERO) {
            "negative"
        } else {
            if (number == ZERO) {
                "zero"
            } else {
                "positive"
            }
        }
    )
    // write your code here
}