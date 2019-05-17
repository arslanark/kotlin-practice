fun main() {
    print("Enter a state abbreviation: ")
    val state = readLine()

//    val capital : String?
//    when (state) {
//        "CA" -> capital = "Sacramento"
//        "OR" -> capital = "Salem"
//        else -> capital = "unknown"
//    }

    val capital = when (state) {
        "CA" -> "Sacramento"
        "OR" -> "Salem"
        else -> "unknown"
    }

    println("The capital is $capital")

    when (state) {
        "CA", "OR", "WA" -> println("West Coast")
        "NH", "VT", "MA" -> println("New England")
        else -> println("Somewhere Else")
    }

    val theAnswer = 50
    when (theAnswer) {
        in 1..39 -> println("Not yet")
        in 40..45 -> println("Close Enough")
        else -> {
            println("Definitely Not!")
            println("No, really!")
        }
    }
}