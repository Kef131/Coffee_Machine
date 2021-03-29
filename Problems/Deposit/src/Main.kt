import kotlin.math.pow

fun earnings(startingAmount: Int = 1000, yearlyPercent: Int = 5, years: Int = 10): Int {
    return (startingAmount * (1 + yearlyPercent.toDouble() / 100).pow(years)).toInt()
}
fun main() {
    val input = readLine()!!
    val value = readLine()!!.toInt()
    print(when (input) {
        "amount" -> earnings(startingAmount = value)
        "percent" -> earnings(yearlyPercent = value)
        "years" -> earnings(years = value)
        else -> ""
    })

}