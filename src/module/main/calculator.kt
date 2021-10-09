@file:Suppress("LocalVariableName")

package module.main
import java.util.*

fun calculator() {
    val reader = Scanner(System.`in`)
    print("Enter number minimum 2: ")

    val Firstnumber = reader.nextDouble()
    val SecondNumber = reader.nextDouble()

    println("+, -, *, /")
    println("Enter the operator: ")
    val resultoperator = reader.next()[0]

    val result: Double = when (resultoperator) {
        '+' -> Firstnumber + SecondNumber
        '-' -> Firstnumber - SecondNumber
        '*' -> Firstnumber * SecondNumber
        '/' -> Firstnumber / SecondNumber
        else -> {
            print("Operator Is incorect.")
            return
        }
    }

    println("Result: ${Firstnumber.toInt()} $resultoperator ${SecondNumber.toInt()} = ${result.toInt()}")
}