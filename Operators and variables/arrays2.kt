import java.util.*
fun main(args: Array<String>) {

    println("Initializing an array of 5 elements with each element being its index times 5")
    val a = Array(5){ it*5 }
    println(a.asList())
}