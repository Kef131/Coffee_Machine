import kotlin.math.abs
    
fun main() {
    val speed = readLine()!!.toInt()
    val speedLimit = readLine()!!
    exceedingSpeed(speed, speedLimit)
}

fun exceedingSpeed(speed: Int, speedLimit: String = "no limit") {
    val speedLim = if (speedLimit == "no limit") 60 else speedLimit.toInt()
    print(when {
        speed <= speedLim -> "Within the limit"
        speed > speedLim -> "Exceeds the limit by ${abs(speedLim - speed)} kilometers per hour"
        else -> ""
    })
}
