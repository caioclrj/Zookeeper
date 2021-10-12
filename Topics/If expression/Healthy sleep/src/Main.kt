fun main() {    
    val min = readLine()!!.toInt()
    val max = readLine()!!.toInt()
    val hours = readLine()!!.toInt()

    println(
        if (hours < min) {
            "Deficiency"
        } else {
            if (hours > max) {
                "Excess"
            } else {
                "Normal"
            }
        }
    ) // write your code here
}