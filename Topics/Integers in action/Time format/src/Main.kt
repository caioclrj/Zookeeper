fun main() {
    val totalSeconds = System.currentTimeMillis() / 1000 // dont change this line
    val seconds = totalSeconds % 60
    val minutes = totalSeconds / 60 % 60
    val hours = totalSeconds / 3600 % 24
    println(hours.toString() + ":" + minutes + ":" + seconds)
}