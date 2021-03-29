fun main() {
    val boy1 = readLine()!!
    val boy2 = readLine()!!
    val boy3 = readLine()!!
    print(boy1 >= boy2 && boy2 >= boy3 || boy1 <= boy2 && boy2 <= boy3)
}