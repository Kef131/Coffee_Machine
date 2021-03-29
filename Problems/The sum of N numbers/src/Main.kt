fun main() {
    val n = readLine()!!.toInt()
    var total = 0
    for (i in 0..n - 1) {
        total += readLine()!!.toInt()
    }
    print(total)
}