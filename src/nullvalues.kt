fun main() {
    val nullValue: String? = null
    println(nullValue)

    val length: Int? = nullValue?.length
    println("Length is $length")

    if (length == null) {
        println("Length is null")
    }

    val message = if (length != null) {
        "Length: $length"
    } else {
        "Length is null"
    }
    println(message)

    val value = length ?: -1
    println("Value: $value")


    try {
        val aValue = length!!
        println("aValue: $aValue")
    } catch (e: KotlinNullPointerException) {
        println("aValue is null")
    }

}