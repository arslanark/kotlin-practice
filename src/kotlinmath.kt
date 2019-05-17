import kotlin.math.*

fun main() {
    val numOne = 15
    val numTwo = 10

    val sum = numOne.plus(numTwo)
    println("Sum: $sum")

    val difference = numOne.minus(numTwo)
    println("Difference: $difference")

    val product = numOne.times(numTwo)
    println("Product: $product")

    val quotient = numOne.toDouble().div(numTwo)
    println("Quotient: $quotient")

    val remainder = numOne.rem(numTwo)
    println("Remainder: $remainder")

    val negative = -152.4
    val absolute = abs(negative)
    println("Absolute: $absolute")
    println("Rounded: ${round(absolute)}")

    println("Have a piece of $PI")
}