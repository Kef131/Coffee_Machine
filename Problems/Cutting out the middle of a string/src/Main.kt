fun main() {
    val string = readLine()!!
    val middle = string.length / 2
    if (string.length % 2 == 0) {
        print(string.substring(0, middle - 1))
        print(string.substring(middle + 1, string.length))
    } else {
        print(string.substring(0, middle))
        print(string.substring(middle + 1, string.length))
    }
}