fun main() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n)
    for (i in 0..numbers.lastIndex) {
        numbers[i] = readLine()!!.toInt()
    }
    var max = numbers[0]
    for (i in 0..numbers.lastIndex) {
        for (j in i + 1..numbers.lastIndex) {
            val product = numbers[i] * numbers[j]
            max = if (product > max) product else max
        }
    }
    print(max)
}
