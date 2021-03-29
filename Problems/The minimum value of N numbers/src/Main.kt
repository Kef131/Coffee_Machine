fun main() {
    val n = readLine()!!.toInt()
    val numbers = IntArray(n)
    numbers[0] = readLine()!!.toInt()
    var min = numbers[0]
    for (i in 1..numbers.lastIndex) {
        numbers[i] = readLine()!!.toInt()
        if (numbers[i] < min) min = numbers[i]
    }
    print(min)
}