data class City(val name: String) {
    var degrees: Int = 0
        set(value) {
            if (value < -92 || value > 57) {
                when (name) {
                    "Moscow" -> field = 5
                    "Hanoi" -> field = 20
                    "Dubai" -> field = 30
                }
            } else field = value
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    if (firstCity.degrees < secondCity.degrees) {
        if (firstCity.degrees < thirdCity.degrees) print(firstCity.name) else print(thirdCity.name)
    } else if (secondCity.degrees < thirdCity.degrees) {
        print(secondCity.name)
    } else if (thirdCity.degrees < secondCity.degrees) {
        print(thirdCity.name)
    } else {
        print("neither")
    }
}