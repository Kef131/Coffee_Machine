import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    var uppercaseA = scanner.nextInt()
    var lowerCaseB = scanner.nextInt()
    var digitsC = scanner.nextInt()
    var symbolsD = scanner.nextInt()
    var password = ""
    val upperCaseLetters = 'A'..'Z'
    val lowerCaseLetters = 'a'..'z'
    val digits = '0'..'9'
    // if is stated that there will be no symbols
    if (symbolsD != 0) {
        while (symbolsD > 0) {
            var randomizer = mutableListOf<Int>()
            if (uppercaseA > 0) randomizer.add(0)
            if (lowerCaseB > 0) randomizer.add(1)
            if (digitsC > 0) randomizer.add(2)
            if (randomizer.isEmpty()) randomizer = mutableListOf(0, 1, 2)
            when (randomizer.random()) {
                0 -> {
                    var nextUpperCase = upperCaseLetters.random()
                    while (password.isNotEmpty() && nextUpperCase == password.last()) {
                        nextUpperCase = upperCaseLetters.random()
                    }
                    password += nextUpperCase
                    uppercaseA--
                    symbolsD--
                }
                1 -> {
                    var nextLowerCase = lowerCaseLetters.random()
                    while (password.isNotEmpty() && nextLowerCase == password.last()) {
                        nextLowerCase = lowerCaseLetters.random()
                    }
                    password += nextLowerCase
                    lowerCaseB--
                    symbolsD--
                }
                2 -> {
                    var nextDigit = digits.random()
                    while (password.isNotEmpty() && nextDigit == password.last()) {
                        nextDigit = digits.random()
                    }
                    password += nextDigit
                    digitsC--
                    symbolsD--
                }
            }
        }
    }
    print(password)
}