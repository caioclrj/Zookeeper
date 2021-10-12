const val ZERO = 0
fun main() {
    val account = readLine()!!.toInt()
    val purchase = readLine()!!.split(' ').map { it.toInt() }
    var index = ZERO
    var rest = ZERO
    var balance = account

    do {
        if (balance - purchase[index] >= ZERO) {
            balance -= purchase[index++]
        } else {
            rest += purchase[index++]
        }
    } while (index != purchase.size)

    println(
        if (rest == ZERO) {
            "Thank you for choosing us to manage your account!" +
                " Your balance is $balance."
        } else {
            "Error, insufficient funds for the purchase. " +
                "Your balance is $balance, but you need $rest."
        }
    ) // write your code here
}