import kotlin.math.pow
fun f(x: Double): Double {
    when {
        x < 0 -> return f1(x)
        x > 0 && x < 1 -> return f2(x)
        x > 1 -> return f3(x)
    }
    return 0.0
}
fun f1(x: Double) = x.pow(2) + 1
fun f2(x: Double) = 1 / x.pow(2)
fun f3(x: Double) = x.pow(2) - 1