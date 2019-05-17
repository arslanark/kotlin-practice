import java.lang.StringBuilder

fun main() {
    val builder = StringBuilder("To be or not to be\n")
        .append("that is the question\n")
        .append("Whether 'tis nobler in the mind\n")
        .append("to suffer the slings and arrows\n")

    val result = builder.toString()
    println(result)
}