package machine

class CoffeeMachine {

    enum class StateCoffeeMachine {
        ChoosingAction, ChoosingCoffee;
    }

    companion object {
        var water = 400
        var milk = 540
        var beans = 120
        var cups = 9
        var money = 550
        var currentStateCoffeeMachine = StateCoffeeMachine.ChoosingAction
    }

    // Handling the user input
    fun inputUser(input: String) {
            when(currentStateCoffeeMachine) {
                StateCoffeeMachine.ChoosingAction -> {
                    when (input) {
                        "buy" -> currentStateCoffeeMachine = StateCoffeeMachine.ChoosingCoffee
                        "fill" -> refill()
                        "take" -> cashClosing()
                        "remaining" -> machineState()
                    }
                }
                StateCoffeeMachine.ChoosingCoffee -> {
                    if (input == "back") currentStateCoffeeMachine = StateCoffeeMachine.ChoosingAction
                    else sellCoffee(input)
                }
            }
    }

    private fun machineState() {
        println("\nThe coffee machine has: \n" +
                "$water of water\n" +
                "$milk of milk\n" +
                "$beans of coffee beans\n" +
                "$cups of disposable cups\n" +
                "$money of money\n")
    }

    private fun refill() {
        print("\nWrite how many ml of water do you want to add: ")
        water += readLine()!!.toInt()
        print("Write how many ml of milk do you want to add: ")
        milk += readLine()!!.toInt()
        print("Write how many grams of coffee beans do you want to add: ")
        beans += readLine()!!.toInt()
        print("Write how many disposable cups of coffee do you want to add: ")
        cups += readLine()!!.toInt()
        println()
    }

    private fun cashClosing() {
        println("\nI gave you $money")
        money -= money
        println()
    }

    private fun sellCoffee(input: String) {
        when (input) {
            "1" -> dispatchCoffee(250,16,4)
            "2" -> dispatchCoffee(350, 20, 7,75)
            "3" -> dispatchCoffee(200,12,6, 100)
        }
        println()
    }

    private fun dispatchCoffee(water: Int, beans: Int, money: Int, milk: Int = 0) {
        if (CoffeeMachine.water < water) {
            println("Sorry, not enough water!")
        } else if(CoffeeMachine.beans < beans) {
            println("Sorry, not enough coffee beans!")
        } else if(CoffeeMachine.cups < cups) {
            println("Sorry, not enough coffee beans!")
        } else if(CoffeeMachine.milk < milk) {
            println("Sorry, not enough coffee beans!")
        } else {
            println("I have enough resources, making you a coffee!")
            CoffeeMachine.water -= water
            CoffeeMachine.beans -= beans
            cups -= 1
            CoffeeMachine.money += money
            CoffeeMachine.milk -= milk
        }
        currentStateCoffeeMachine = StateCoffeeMachine.ChoosingAction
    }
}

fun main() {
    val coffeeMachine = CoffeeMachine()
    var input = ""
    do {
        when(CoffeeMachine.currentStateCoffeeMachine) {
            CoffeeMachine.StateCoffeeMachine.ChoosingAction -> {
                print("Write action (buy, fill, take, remaining, exit): ")
                input = readLine()!!
                coffeeMachine.inputUser(input)
            }
            CoffeeMachine.StateCoffeeMachine.ChoosingCoffee -> {
                print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
                input = readLine()!!
                coffeeMachine.inputUser(input)
            }
        }
    } while (input != "exit")
}