package oop

fun main() {
    val x = Any()
    println(x)

    val sup = SuperClass(42)
    println(sup)

    val sub = SubClass(52)
    println(sub)

    println(sup.multiply(100))
    println(sub.multiply(50))
}

open class SuperClass(anInt: Int) {
    protected val _anInt = anInt

    override fun toString(): String {
        return "${this::class.simpleName} {anInt: $_anInt}"
    }

    open fun multiply(factor: Int): Int {
        return _anInt * factor
    }
}

class SubClass(anInt: Int) : SuperClass(anInt) {
//    override fun toString(): String {
//        return "SubClass{anInt: $_anInt}"
//    }

    override fun multiply(factor: Int): Int {
        return super.multiply(factor) * factor
    }
}
