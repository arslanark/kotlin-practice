package companionobject

fun main() {
    try {
        val valueOneInput = MathLib.getInput("Value 1: ")
        val valueTwoInput = MathLib.getInput("Value 2: ")
        val result: Double? = MathLib.add(valueOneInput, valueTwoInput)
        println("Result: $result")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println(e.message)
    }
}