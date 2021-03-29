object Math {
    fun abs(num: Int): Int {
        return when {
            num == 0 -> 0
            num > 0 -> num
            num < 0 -> num * -1
            else -> num
        }
    }
    fun abs(num: Double): Double {
        return when {
            num == 0.0 -> 0.0
            num > 0.0 -> num
            num < 0.0 -> num * -1.0
            else -> num
        }
    }
}