fun main() {
    val n = readLine()!!.toInt()
    var countA = 0
    var countB = 0
    var countC = 0
    var countD = 0
    repeat(n) {
        when (readLine()!!.toInt()) {
            5 -> countA++
            4 -> countB++
            3 -> countC++
            2 -> countD++
        }
    }
    print("$countD $countC $countB $countA ")
}