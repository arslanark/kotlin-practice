package dataclass

import java.text.NumberFormat

fun main() {

    val item = ClothingItem("Shirt", "L", 199.99)
    println(item)
    item.price = 15.99
    println(item)

    val itemTwo = ClothingItem("M", 24.99)
    println(itemTwo)

    println("Item type = ${itemTwo.type}")

    itemTwo.price = 10.0
    val format = "%.2f"
    println("Item price = $${format.format(itemTwo.price)}")

    val formatter = NumberFormat.getCurrencyInstance()
    println("Item price = ${formatter.format(itemTwo.price)}")

    val person = Person("Arslan", "Mushtaq")
    println("Full Name: ${person.fullName}")



}