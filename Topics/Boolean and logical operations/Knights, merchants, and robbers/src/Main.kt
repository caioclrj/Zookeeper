fun main() {    
    val firstAnswer = readLine().toBoolean() // read other values in the same way
    val secondAnswer = readLine().toBoolean()
    val confession = readLine().toBoolean()
    println(!confession && !(firstAnswer xor secondAnswer)) // write your code here
}