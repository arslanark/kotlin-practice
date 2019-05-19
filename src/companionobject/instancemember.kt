package companionobject

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    try {
        val mathLib = MathLib()
        while (true) {
            val number = MathLib.getInput("Enter a number: ")
            mathLib.addValue(number)
            println("Current total: ${mathLib.runningTotal}")
        }
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}