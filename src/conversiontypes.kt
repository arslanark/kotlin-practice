fun main() {

    // Converting from smaller to higher
    val valueInteger = 42
    val valueLong: Long = valueInteger.toLong()
    // :: gives the class reference of the object
    println("Type of long: ${valueLong::class.simpleName}")
    println("Type of long: ${valueLong::class.qualifiedName}")

    // Converting from higher to smaller
    val valueLongA = 24.1
    val valueIntegerA = valueLongA.toInt()
    println("Value of valueLongA: $valueLongA")
    println("Value of valueIntegerA: $valueIntegerA")
}