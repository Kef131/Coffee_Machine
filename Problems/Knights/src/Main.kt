import kotlin.math.abs

fun main() {
    val (xKnight1, yKnight1) = readLine()!!.split(" ").map { it.toInt() }
    val (xKnight2, yKnight2) = readLine()!!.split(" ").map { it.toInt() }
    val diffXKnights = abs(xKnight2 - xKnight1)
    val diffYKnights = abs(yKnight2 - yKnight1)
    if (diffXKnights == 1 && diffYKnights == 2 || diffXKnights == 2 && diffYKnights == 1) {
        println("YES")
    } else println("NO")
}