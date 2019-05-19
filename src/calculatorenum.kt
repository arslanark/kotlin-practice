import Operation.*

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
            ADD.operator -> add(valueOneInput, valueTwoInput)
            SUBTRACT.operator -> sub(valueOneInput, valueTwoInput)
            DIVIDE.operator -> div(valueOneInput, valueTwoInput)
            MULTIPLY.operator -> mul(valueOneInput, valueTwoInput)
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