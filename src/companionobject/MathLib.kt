package companionobject

class MathLib {

    var runningTotal = 0.0

    fun addValue(value: Double) {
        runningTotal += value
    }

    companion object {
        fun add(valueOne: Double, valueTwo: Double) : Double {
            return valueOne + valueTwo
        }

        fun getInput(prompt: String): Double {
            print(prompt)
            val number: String? = readLine()
            val output = number!!.toBigDecimal()
            return output.toDouble()
        }
    }
}