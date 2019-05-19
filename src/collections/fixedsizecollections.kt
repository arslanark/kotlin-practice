package collections

fun main() {

    val colors = arrayOf("Red", "Green", "Blue")
    print("Colors: ")
    for (element in colors) {
        print("$element, ")
    }

    println()

    val mixed = arrayOf("String", 12)
    print("Mixed: ")
    for (element in mixed) {
        print("$element, ")
    }

    println()

    val nulls = arrayOfNulls<String>(3)
    print("Nulls: ")
    for (element in nulls) {
        print("$element, ")
    }

    println()
    nulls[0] = "Red"
    nulls[1] = "Blue"
    nulls.set(2, "Green")
    print("Null with values: ")
    for (element in nulls) {
        print("$element, ")
    }

    println()
    val intArray = intArrayOf(3, 4, 5)
    print("Integer Array: ")
    for (element in intArray) {
        print("$element, ")
    }

    println()
    colors.sort()
    print("Sorted Colors Array: ")
    for (element in colors) {
        print("$element, ")
    }

    println()
    val descendingArray = colors.sortedArrayDescending()
    print("Descending Colors Array: ")
    for (element in descendingArray) {
        print("$element, ")
    }
}