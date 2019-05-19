package oop

fun main() {

    val helloWorld = {
        println("Hello World")
    }
    helloWorld()
    helloWorld.invoke()

    val sayHello = {
        user: String, age: Int ->
        println("Hello, $user, you're $age years old!")
    }
    sayHello("Arslan", 24)

    val states = arrayOf("New York", "New Hampshire", "Vermont",
        "Rhode Island", "Nebraska")
//    val sorted = states.sortedBy { state -> state.length }
    val sorted = states.sortedBy { it.length }
        .filter { it.startsWith("n", true) }
    for (state in sorted) {
        println(state)
    }
}