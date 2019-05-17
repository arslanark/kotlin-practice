fun main() {
    val states = arrayOf("CA", "OR", "WA")

    addHeader("While loop")
    var counter  = 0
    while (counter < states.size) {
        println("${states.get(counter)} [$counter]")
        counter++
    }

    addHeader("Do / While loop")
    counter = 0
    do {
        println("${states.get(counter)} [$counter]")
        counter++
    } while (counter < states.size)
}

fun addHeader(label: String) {
    println("******************")
    println(label)
    println("******************")
}