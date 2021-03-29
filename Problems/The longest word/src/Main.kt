fun main() {
    val input = readLine()!!
    val words = input.replace(".", "").split(" ").toTypedArray()
    var maxWord = words[0]
    for (word in words) {
        if (word.length > maxWord.length) maxWord = word
    }
    print(maxWord)
}
