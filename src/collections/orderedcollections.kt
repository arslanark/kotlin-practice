package collections

fun main() {

    val colors = listOf("Red", "Green", "Blue", 12)
    println(colors)

    println("Number of colors: ${colors.size}")
    println(colors::class.simpleName)

    val cars = mutableListOf<String>()
    cars.add("Audi")
    cars.add("Honda")
    cars.add("Toyota")
    cars.add("Ferrari")
    cars.add("Mustang")

    println("Cars: $cars")

    cars.sort()
    println("Sorted Car List: $cars")

    val desCar = cars.sortedDescending()
    println("Descending Sorted Car List: $desCar")

    cars.removeAt(0)
    println("Cars: $cars")

    cars.remove("Honda")
    println("Cars: $cars")
}