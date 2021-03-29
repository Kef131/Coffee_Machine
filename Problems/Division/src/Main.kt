fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    val divide = { a: Long, b: Long -> a.toDouble() / b.toDouble() }
    println(divide(a, b))
}
