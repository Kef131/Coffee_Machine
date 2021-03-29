import java.lang.IllegalArgumentException

enum class CountryCurrency(val currency: String) {
    Germany("Euro"),
    Mali("CFA franc"),
    Dominica("Eastern Caribbean dollar"),
    Canada("Canadian dollar"),
    Spain("Euro"),
    Australia("Australian dollar"),
    Brazil("Brazilian real"),
    Senegal("CFA franc"),
    France("Euro"),
    Grenada("Eastern Caribbean dollar"),
    Kiribati("Australian dollar");

    companion object {
        fun compareCurrency(firstCountry: String, secondCountry: String): Boolean {
            return try {
                valueOf(firstCountry).currency == valueOf(secondCountry).currency
            } catch (e: IllegalArgumentException) {
                false
            }
        }
    }

}
fun main() {
    val (firstCountry, secondCountry) = readLine()!!.split(" ")
    println(CountryCurrency.compareCurrency(firstCountry, secondCountry))
}