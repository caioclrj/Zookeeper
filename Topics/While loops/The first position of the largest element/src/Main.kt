import java.util.*

const val ZERO = 0
fun main() {
    val scanner = Scanner(System.`in`) // reads data
    val numbers = mutableListOf<Int>()
    while (scanner.hasNextInt()) {
        numbers.add(scanner.nextInt())
    } // put your code here
    println("${numbers.maxOrNull()} ${numbers.indexOf(numbers.maxOrNull()) + 1}")
}

