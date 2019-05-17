fun main() {
    val numOne = 4.0
    val numTwo = 3.5

    val result = addValues(valueOne = numOne, valueTwo = numTwo)
    println("Result: $result")

    val calcResult = calcValues(valueOne = numOne, valueTwo = numTwo, operation = "-")
    println("Result: $calcResult")

    changeSomething(5.0)

    val sum: Int = addValues(1, 3, 5, 7)
    println("Sum: $sum")
}

fun addValues(valueOne: Double, valueTwo: Double): Double {
    return valueOne + valueTwo
}

fun calcValues(valueOne: Double, valueTwo: Double, operation: String = "+"): Double {
    if (operation.equals("+")) {
        return valueOne + valueTwo
    } else if (operation.equals("-")) {
        return valueOne - valueTwo
    } else {
        return 1.0
    }
}

fun changeSomething(param: Double) {
    var copy = param
    copy++
    println("Copy is incremented to $copy")
}

fun addValues(vararg numbers: Int): Int {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result
}