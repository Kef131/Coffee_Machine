fun main() {
    val dna = readLine()!!
    var lastLetter = dna.first()
    var counter = 1
    if (lastLetter != 0.toChar()) {
        for (i in 1..dna.lastIndex) {
            if (lastLetter == dna[i]) {
                counter++
            } else {
                print("$lastLetter$counter")
                lastLetter = dna[i]
                counter = 1
            }
        }
    }
    print("$lastLetter$counter")
}
