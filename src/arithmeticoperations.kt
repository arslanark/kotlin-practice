fun main() {
    var numOne = 15
    val numTwo = 10

    val sum = numOne + numTwo
    println("Direct companionobject.Operation: $sum")

    val sumFunction = numOne.plus(numTwo)
    println("Function companionobject.Operation: $sumFunction")

    val sub = numOne - numTwo
    println("Direct Subtraction Result: $sub")

    val subFunction = numOne.minus(numTwo)
    println("Function Subtraction Result: $subFunction")

    numOne++
    println("After increment: $numOne")

    val numThree = numOne.inc()
    println("After increment function: $numThree")

}
