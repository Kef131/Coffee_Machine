
fun main() {
    // write your code here
    val url = readLine()!!
    var index = 0
    val parameters = mutableMapOf<String, String>()
    var repeatPassword = false
    while (index < url.length - 1) {
        if (url[index] == '?' || url[index] == '&') {
            var keyString = ""
            var valueString = ""
            index++
            while (url[index] != '=') {
                keyString += url[index]
                index++
            }
            index++
            while (index <= url.length - 1 && url[index] != '&') {
                valueString += url[index]
                index++
            }
            if (valueString == "") valueString = "not found"
            parameters.put(keyString, valueString)
        } else index++
    }
    for (parameter in parameters) {
        if (parameter.key == "pass") repeatPassword = true
        println("${parameter.key} : ${parameter.value}")
    }
    if (repeatPassword) {
        print("password : ${parameters["pass"]}")
    }

}