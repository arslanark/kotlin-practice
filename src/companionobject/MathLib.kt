package companionobject

class MathLib {
    companion object {
        fun add(valueOne: Double, valueTwo: Double) : Double {
            return valueOne + valueTwo
        }

        fun getInput(prompt: String): Double {
            print(prompt)
            val number: String? = readLine()
            val output = number!!.toDouble()
            return output
        }
    }
}