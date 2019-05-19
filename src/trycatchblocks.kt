fun main() {
    try {

        print("Value One: ")
        val valueOne = readLine()
        val valueOneInput = valueOne!!.toDouble()

        print("Value Two: ")
        val valueTwo = readLine()
        val valueTwoInput = valueTwo!!.toDouble()

        val sum = valueOneInput + valueTwoInput
        println("Result: $sum")

    } catch (e: KotlinNullPointerException) {
        println("Value was null")
    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    }
}