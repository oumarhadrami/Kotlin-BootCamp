import kotlin.math.*
fun main(args: Array<String>) {
    val array = Array(7){(1000.0).pow(it)}
    val sizes = arrayOf("byte","kilobyte", "megabyte", "gigabyte",
            "terabyte", "petabyte", "exabyte")
    for ((i,element) in array.withIndex()) println("1 ${sizes[i]} = ${element.toLong()} bytes")
}