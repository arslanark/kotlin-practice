import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    try {
        print("Value 1: ")
        val valueOne = readLine()
        val valueOneInput = valueOne!!.toDouble()

        print("Value 2: ")
        val valueTwo = readLine()
        val valueTwoInput = valueTwo!!.toDouble()

        print("Select an Operation (+ - / *): ")
        val operation = readLine()
        val result: Double? = when (operation) {
            "+" -> add(valueOneInput, valueTwoInput)
            "-" -> sub(valueOneInput, valueTwoInput)
            "/" -> div(valueOneInput, valueTwoInput)
            "*" -> mul(valueOneInput, valueTwoInput)
            else -> throw Exception("Unknown Operation")
        }
        println("Result: $result")
    } catch (e: KotlinNullPointerException) {
        println("Vale was null!")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun add(valueOne: Double, valueTwo: Double) : Double {
    return valueOne + valueTwo
}

fun sub(valueOne: Double, valueTwo: Double) : Double {
    return valueOne - valueTwo
}

fun mul(valueOne: Double, valueTwo: Double) : Double {
    return valueOne * valueTwo
}

fun div(valueOne: Double, valueTwo: Double) : Double {
    return valueOne / valueTwo
}
