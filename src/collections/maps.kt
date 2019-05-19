package collections

import dataclass.ClothingItem

fun main() {

    val colorMap = mapOf<String, Long>(
        Pair("Red", 0xFF0000),
        Pair("Green", 0x000FF0),
        Pair("Blue", 0x0000FF)
    )
    println(colorMap)
    println(colorMap::class.simpleName)

    val stateMap = mutableMapOf<String, String>()
    stateMap.put("CA", "Sacramento")
    stateMap.put("OR", "Salem")
    stateMap.put("WA", "Olympia")
    println(stateMap)

    for (state in stateMap.keys) {
        println("The capital of $state is ${stateMap.get(state)}")
    }

    for ((state, capital) in stateMap) {
        println("The capital of $state is $capital")
    }

    val cart = mutableMapOf<ClothingItem, Int>()
    cart[ClothingItem("Shirt", "XL", 14.99)] = 2
    cart[ClothingItem("Pants", "32", 19.99)] = 4
    cart[ClothingItem("Hat", "8.5", 24.00)] = 1
    println(cart)

    var total = 0.0
    for ((item, quantity) in cart) {
        val itemTotal:Double = quantity * item.price
        println("Item ${item.type} @ ${item.price} = $itemTotal")
        total += itemTotal
    }
    println("---------------")
    println("Total: $total")

}