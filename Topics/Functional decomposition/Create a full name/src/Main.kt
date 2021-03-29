fun getFullNames() {
    println(createFullName(readLine()!!, readLine()!!))
    println(createFullName(readLine()!!, readLine()!!))
    println(createFullName(readLine()!!, readLine()!!))
}

fun createFullName(firstName: String, lastName: String) = "$firstName $lastName"